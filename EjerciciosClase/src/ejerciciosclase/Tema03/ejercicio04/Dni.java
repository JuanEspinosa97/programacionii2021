package ejerciciosclase.Tema03.ejercicio04;

/**
 * Se deben realizar todas las comprobaciones necesarias para asegurar que las
 * clases de datos almacenan tipos de datos correctos (esta clase DNI solo podra
 * contener un numero y letra que coincidan, numero entre 0 y 99999999, etc...).
 * Los casos problematicos se señalizan con excepciones.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Dni {

    private static final int MAX = 100000000;   //El numero debe estar comprendido entre 0 y 99999999;
    private static final String LETRAS = "ABCDEFGHJKLMNPQRSTVWXYZ"; //Letras posibles que puede tomar un DNI: todas menos la i, la o, la u, la ñ.

    private int numero;
    private char letra;
    private String numLetra = this.numero + "" + this.letra;

    public Dni() {   //Constructor por defecto. Genera un numero aleatoria y calcula su letra correspondiente

        this.numero = (int) (Math.random() * MAX);
        this.letra = calcularLetra(this.numero);

    }

    public Dni(int numero) throws DniException {    //Este constructor calcula la letra a partir de un numero introducido por el usuario

        this.numero = numero;
        this.letra = calcularLetra(numero);

    }

    public Dni(int numero, char letra) throws DniException {    //Este constructor comprueba que el numero y la letra introducidos coinciden

        comprobarDni(numero, letra);
        this.numero = numero;
        this.letra = letra;

    }

    public Dni(String numLetra) throws DniException {   //Este constructor debería comprobar que el numero y la letra del String son correctos

        this.numLetra = numLetra;

    }

    public int getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public String getNumLetra() {
        return numLetra;
    }

    private static char calcularLetra(int numero) {

        return LETRAS.charAt(numero % 23);

    }

    private static void comprobarDni(int numero, char letra) throws DniException {

        if (numero > 0 || numero < MAX || calcularLetra(numero) != letra) {

            throw new DniException();

        }

    }

    @Override
    public String toString() {

        return "" + this.numero + "" + this.letra;

    }

}

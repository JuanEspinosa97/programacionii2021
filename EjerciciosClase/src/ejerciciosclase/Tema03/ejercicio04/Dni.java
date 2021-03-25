package ejerciciosclase.Tema03.ejercicio04;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Dni {

    private int numero;
    private char letra;
    private String numLetra;

    public Dni(int numero) {

        this.numero = numero;

    }

    public Dni(int numero, char letra) {

        this.numero = numero;
        this.letra = letra;

    }

    public Dni(String numLetra) {

        this.numLetra = numLetra;

    }

    public Dni() {   //Constructor por defecto

        numLetra = "02740912W";

    }

    @Override
    public String toString() {

        return "DNI:" + this.numLetra;

    }

}

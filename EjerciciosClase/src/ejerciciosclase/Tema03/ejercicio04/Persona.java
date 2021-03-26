package ejerciciosclase.Tema03.ejercicio04;

import static java.lang.Math.*;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Persona {

    private String nombre;
    private int edad;
    private Dni dni;
    private Sexo sexo;
    private double peso;
    private double altura;

    public Persona() {  //Constructor por defecto

        this.nombre = "";
        this.edad = 0;
        this.dni = new Dni();
        this.sexo = Sexo.FEMENINO;
        this.peso = 0;
        this.altura = 0;

    }

    public Persona(String nombre, int edad, Sexo sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = new Dni();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;

    }

    public Persona(String nombre, int edad, Sexo sexo, double peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = new Dni();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public Persona(String nombre, int edad, Dni dni, Sexo sexo, double peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el índice de masa corporal de la persona. La fórmula es la
     * siguiente: peso/(altura^2). La altura deberá estar especificada en metros
     * y el peso en kilogramos.
     *
     * @return indice masa corporal
     */
    public double calcularIMC() {   //El metodo no lo nombro static para acceder a this

        return this.peso / pow(this.altura, 2);

    }

    /**
     * Devolverá un enumerado que indique si el individuo está por debajo de su
     * peso ideal, en su peso ideal o tiene sobrepeso. Sobrepeso se define como
     * IMC > 25 y se considera que se está por debajo del peso ideal si IMC
     * menor que 18.
     *
     * @return enumerado Peso
     */
    public Peso valorarPesoCorporal() { //El metodo no lo nombro static para acceder a calcularIMC

        if (calcularIMC() > 25) {

            return Peso.SOBREPESO;

        } else if (calcularIMC() < 18) {

            return Peso.DESNUTRIDO;

        } else {

            return Peso.IDEAL;

        }

    }

    /**
     * Indica si es mayor de edad, devuelve un booleano.
     *
     * @return true si es mayor de edad y false si no lo es
     */
    public boolean esMayorDeEdad() {

        return this.edad >= 18;

    }

    /**
     * Devuelve toda la información de la persona como una cadena de caracteres
     *
     * @return cadena de caracteres
     */
    @Override
    public String toString() {

        return "Informacion sobre " + this.nombre + ":\n"
                + "Edad: " + this.edad + "\n"
                + "DNI: " + this.dni + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Peso: " + this.peso + "\n"
                + "Altura: " + this.altura + "\n";

    }

}

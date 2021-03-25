package ejerciciosclase.Tema03.ejercicio04;

import static ejerciciosclase.Utilidades.Utils.leerCadena;
import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.leerReal;
import static ejerciciosclase.Utilidades.Utils.leerSexo;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //Pedir por teclado el nombre, la edad, el sexo, el peso y la altura
        System.out.println("Introduzca su nombre: ");
        String nombre = leerCadena();
        System.out.println("Introduzca su edad: ");
        int edad = leerEntero();
        System.out.println("Introduzca su sexo(FEMENINO o MASCULINO): ");
        Sexo sexo = leerSexo();
        System.out.println("Introduzca su peso: ");
        double peso = leerReal();
        System.out.println("Introduzca su altura(en metros): ");
        double altura = leerReal();

        /*Crear 3 objetos de la clase Persona. El primer objeto obtendrá las anteriores variables
        pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos peso y altura
        y el último por defecto utilizando métodos set para darle a los atributos un valor.*/
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

    }

}

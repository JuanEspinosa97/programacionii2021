package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerCadena;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que acepte una cadena de caracteres (que podrá contener
 * cualquier carácter a excepción del retorno de carro) y que la escriba al
 * revés.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        sop("Introduzca una frase: ");
        String frase = leerCadena();
        String cadenaInvertida = invertirCadena(frase);
        sop("La frase introducida al reves es la siguiente: " + cadenaInvertida);

    }

    public static String invertirCadena(String frase) {

        String cadenaInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {

            cadenaInvertida += frase.charAt(i);

        }

        return cadenaInvertida;

    }

}

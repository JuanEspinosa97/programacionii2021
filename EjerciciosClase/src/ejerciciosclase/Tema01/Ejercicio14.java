package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerCadena;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que lee una cadena de caracteres de teclado e indique si
 * es o no palíndroma (se lee igual de izquierda a derecha que de derecha a
 * izquierda, sin tener en cuenta los espacios en blanco y las mayúsculas). Por
 * ejemplo: "dábale arroz a la zorra el abad".
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        sop("Introduzca una frase para ver si es palindroma o no: ");
        String frase = leerCadena();
        frase = limpiarFrase(frase);
        if ((esPalindroma(frase))) {

            sop("Es palindroma.");

        } else {

            sop("No es palindroma.");

        }

    }

    public static String limpiarFrase(String frase) {

        frase = frase.toLowerCase(); //pasar a minuscula
        frase = frase.replace(" ", ""); //quitar espacios en blanco
        frase = frase.replace("á", "a");
        frase = frase.replace("é", "e");
        frase = frase.replace("í", "i");
        frase = frase.replace("ó", "o");
        frase = frase.replace("ú", "u");

        return frase;

    }

    public static boolean esPalindroma(String frase) {

        int inicio = 0;
        int fin = frase.length() - 1;
        boolean palindroma = false;

        while ((inicio < fin) && (!palindroma)) {

            if (frase.charAt(inicio) == frase.charAt(fin)) {

                inicio++;
                fin--;

            } else {

                palindroma = true;

            }

        }

        return !palindroma;

    }

}

package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerCadena;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que acepte una cadena de caracteres (que podrá contener
 * cualquier carácter a excepción del retorno de carro) y que diga cuántas
 * vocales contiene.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        sop("Introduzca una frase: ");
        String frase = leerCadena();
        frase = limpiarFrase(frase);
        int c = contarCaracteres(frase);
        sop("Su frase tiene " + c + " vocales."); //mejor System.out.println();

    }

    public static int contarCaracteres(String frase) {

        int c = 0;
        for (int i = 0; i < frase.length(); i++) {

            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
                    || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {

                c++;

            }

        }
        return c;

    }

    public static String limpiarFrase(String frase) {

        frase = frase.toLowerCase(); //pasar a minuscula
        frase = frase.replace("á", "a");
        frase = frase.replace("é", "e");
        frase = frase.replace("í", "i");
        frase = frase.replace("ó", "o");
        frase = frase.replace("ú", "u");

        return frase;

    }

}

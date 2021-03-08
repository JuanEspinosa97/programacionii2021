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
        frase = quitarTildes(frase);
        int c = contarCaracteres(frase);
        sop("Su frase tiene " + c + " vocales.");

    }

    public static int contarCaracteres(String frase) {

        int c = 0;
        for (int i = 0; i < frase.length(); i++) {

            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
                    || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')
                    || (frase.charAt(i) == 'A') || (frase.charAt(i) == 'E')
                    || (frase.charAt(i) == 'I') || (frase.charAt(i) == 'O')
                    || (frase.charAt(i) == 'U')) {

                c++;

            }

        }
        return c;

    }

    public static String quitarTildes(String frase) {

        frase = frase.replace("á", "a");
        frase = frase.replace("é", "e");
        frase = frase.replace("í", "i");
        frase = frase.replace("ó", "o");
        frase = frase.replace("ú", "u");
        frase = frase.replace("Á", "A");
        frase = frase.replace("É", "E");
        frase = frase.replace("Í", "I");
        frase = frase.replace("Ó", "O");
        frase = frase.replace("Ú", "U");

        return frase;

    }

}

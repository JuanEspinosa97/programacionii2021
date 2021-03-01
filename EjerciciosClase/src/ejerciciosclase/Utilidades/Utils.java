package ejerciciosclase.Utilidades;

import java.io.*;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Utils {

    /**
     * Forma abreviada de System.out.println. Introducir el mensaje que queramos
     * representar
     *
     * @param mensaje
     */
    public static void sop(String mensaje) {

        System.out.println(mensaje);

    }

    public static String leerCadena() {

        InputStreamReader isr = null;
        BufferedReader consola = null;

        String comando = "";
        boolean error = true;

        while (error) {

            try {

                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                comando = consola.readLine();
                error = false;

            } catch (Exception e) {

                System.out.println("Error.");

            }
        }
        return comando;
    }

    public static int leerEntero() {

        InputStreamReader isr = null;
        BufferedReader consola = null;

        int resultado = 0;
        boolean error = true;

        while (error) {

            try {

                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                String comando = consola.readLine();
                resultado = Integer.parseInt(comando);
                error = false;

            } catch (Exception e) {

                System.out.println("Error.");

            }
        }
        return resultado;
    }

}

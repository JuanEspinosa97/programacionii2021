package practicamarvel.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Utils {

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

}

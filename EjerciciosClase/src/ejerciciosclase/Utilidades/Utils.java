package ejerciciosclase.Utilidades;

import ejerciciosclase.Tema03.ejercicio04.Sexo;
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

    public static double leerReal() {

        InputStreamReader isr = null;
        BufferedReader consola = null;

        double resultado = 0;
        boolean error = true;

        while (error) {

            try {

                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                String comando = consola.readLine();
                resultado = Double.parseDouble(comando);
                error = false;

            } catch (Exception e) {

                System.out.println("Error.");

            }
        }
        return resultado;
    }

    public static Sexo leerSexo() {

        boolean error = true;
        String cadena = null;
        Sexo sexo = null;

        while (error) {

            try {

                cadena = leerCadena();
                sexo = Sexo.valueOf(cadena.toUpperCase());
                error = false;

            } catch (IllegalArgumentException iae) {

                System.out.println("Debe introducir (FEMENINO o MASCULINO).");

            }

        }

        return sexo;

    }

}

package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que visualice por pantalla la tabla de multiplicar de los
 * 10 primeros números naturales.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio05 {

    public static void imprimirTabla() {

        int i;
        int j;

        for (i = 1; i <= 10; i++) {

            for (j = 0; j <= 10; j++) {

                sop(i + " x " + j + " = " + (i * j));

            }

        }

    }

    public static void main(String[] args) {

        sop("Tabla de multiplicar de los 10 primeros numeros naturales: ");
        imprimirTabla();

    }

}

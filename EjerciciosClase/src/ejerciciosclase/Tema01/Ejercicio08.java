package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Empleando un array, escribir un programa que pida al usuario números enteros
 * hasta que se introduzca el número 0. A continuación, calcular la media, el
 * mínimo y el máximo de los datos introducidos.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio08 {

    public static void pedirDatosAlUsuario(int[] datos) { //No consigo que los lea bien

        for (int j = 0; j < 10; j++) {
            datos[j] = -1;
        }

        int i = 0;

        do {

            datos[i] = leerEntero();
            i++;
            if (datos[i] == 0) {

                return;

            }

        } while (datos[i] != 0);

        for (int j = 0; j < 10; j++) {
            sop("" + datos[j]);
        }

    }

    public static void calcularMinimoYMaximo(int[] array, int[] datos) {

        int mayor = 0;
        int menor = Integer.MAX_VALUE;
        int i = 0;

        for (int j = 0; j < 10; j++) {
            sop("" + datos[j]);
        }

        do {

            if (datos[i] != 0) {

                if (mayor < datos[i]) {

                    mayor = datos[i];

                }
                if (menor > datos[i]) {

                    menor = datos[i];

                }
                i++;

            }

        } while (datos[i] != 0);

        array[0] = menor;
        sop("" + menor);
        array[1] = mayor;
        sop("" + mayor);

    }

    public static void imprimirMinimoYMaximo(int[] array) {

        for (int i = 0; i < 2; i++) {

            if (i == 1) {

                System.out.print(array[i]);
                return;

            }

            System.out.print(array[i] + " y ");

        }

    }

    public static void main(String[] args) {

        int[] datos = new int[10];
        int[] array = new int[2];  //almacena el minimo y maximo

        sop("Introduzca numeros (para terminar, introduzca 0): ");
        pedirDatosAlUsuario(datos);
        //System.out.print("El numero menor y mayor de los introducidos por teclado son: ");
        //calcularMinimoYMaximo(array, datos);
        //imprimirMinimoYMaximo(array);
        //sop(" respectivamente.");

    }

}

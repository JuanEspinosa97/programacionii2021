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

    public static int[] pedirDatosAlUsuario() {

        int[] datos = new int[1000];

        for (int i = 0; i < 1000; i++) {    //Evito que el array esté lleno de ceros y así el usuario puede introducir un cero para terminar

            datos[i] = -1;

        }

        int i = 0;

        do {

            datos[i] = leerEntero();
            if (datos[i] == 0) {

                break;

            }
            i++;

        } while (datos[i] != 0);

        int[] array2 = new int[i + 1];  //llevar la cuenta de cuantas posiciones estan ocupadas

        for (int j = 0; j <= i; j++) {

            array2[j] = datos[j];

        }

        return array2;

    }

    public static int[] calcularMinimoYMaximo(int[] datos) {

        int[] array = new int[2];  //almacena el minimo y maximo
        int mayor = 0;
        int menor = Integer.MAX_VALUE;
        int i = 0;

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
        array[1] = mayor;

        return array;

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

    public static double calcularMedia(int[] datos) {

        double suma = 0;
        int i = 0;

        do {

            suma += datos[i];
            i++;

        } while (i < datos.length - 1); //No queremos que cuente el cero introducido para salir

        double media = suma / i;

        return media;

    }

    public static void main(String[] args) {

        sop("Introduzca numeros (para terminar, introduzca 0): ");
        int[] datos = pedirDatosAlUsuario();
        System.out.print("El numero menor y mayor de los introducidos por teclado son: ");
        int[] array = calcularMinimoYMaximo(datos);
        imprimirMinimoYMaximo(array);
        sop(" respectivamente.");
        sop("La media de los numeros introducidos por teclado es: " + calcularMedia(datos));

    }

}

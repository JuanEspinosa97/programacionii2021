package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que calcule el mínimo y el máximo de una lista de números
 * enteros positivos introducidos por el usuario. La lista finalizará cuando se
 * introduzca un número negativo.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio04 {

    public static void calcularMinimoYMaximo(int[] array) {

        int mayor = 0;
        int menor = Integer.MAX_VALUE;

        int datosIntroducidos;

        do {

            datosIntroducidos = leerEntero();

            if (datosIntroducidos >= 0) {

                if (mayor < datosIntroducidos) {

                    mayor = datosIntroducidos;

                }
                if (menor > datosIntroducidos) {

                    menor = datosIntroducidos;

                }

            }

        } while (datosIntroducidos >= 0);

        array[0] = menor;
        array[1] = mayor;

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

        int[] array = new int[2];

        sop("Introduzca numeros (para terminar, introduzca un numero negativo): ");
        calcularMinimoYMaximo(array);
        System.out.print("El numero menor y mayor de los introducidos por teclado son: ");
        imprimirMinimoYMaximo(array);
        sop(" respectivamente.");

    }

}

package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribir un programa que multiplique dos matrices. Sus dimensiones y valores
 * deben de solicitarse al usuario por teclado y tras realizar la multiplicación
 * debe visualizarse en pantalla ambas matrices y el resultado de la
 * multiplicación.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        int filas1;
        int columnas1;
        int filas2;
        int columnas2;

        sop("Introduzca las dimensiones de la primera matriz. ");
        sop("FILAS: ");
        filas1 = leerEntero();
        sop("COLUMNAS: ");
        columnas1 = leerEntero();

        sop("MATRIZ 1: ");
        imprimirDimensionesMatriz(filas1, columnas1);

        int matriz1[][] = new int[filas1][columnas1];

        sop("Introduzca los elementos de la primera matriz. ");
        rellenarMatriz(filas1, columnas1, matriz1);

        sop("MATRIZ 1: ");
        imprimirMatriz(filas1, columnas1, matriz1);

        sop("Introduzca las dimensiones de la segunda matriz. ");
        sop("FILAS: ");
        filas2 = leerEntero();
        sop("COLUMNAS: ");
        columnas2 = leerEntero();

        sop("MATRIZ 2: ");
        imprimirDimensionesMatriz(filas2, columnas2);

        int matriz2[][] = new int[filas2][columnas2];

        sop("Introduzca los elementos de la segunda matriz. ");
        rellenarMatriz(filas2, columnas2, matriz2);

        sop("MATRIZ 2: ");
        imprimirMatriz(filas2, columnas2, matriz2);

        int matrizResultado[][] = new int[filas1][columnas2];

        multiplicarMatrices(filas1, filas2, columnas1, columnas2, matriz1, matriz2, matrizResultado);

        sop("MATRIZ RESULTADO: ");
        imprimirMatriz(filas1, columnas2, matrizResultado);

    }

    public static void imprimirDimensionesMatriz(int filas, int columnas) {

        sop(+filas + " x " + columnas);

    }

    public static void rellenarMatriz(int filas, int columnas, int[][] matriz) {

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = leerEntero();

            }

        }

    }

    public static void imprimirMatriz(int filas, int columnas, int[][] matriz) {

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print("" + matriz[i][j] + "");
                System.out.print("\t");

            }
            sop("");

        }

    }

    public static void multiplicarMatrices(int filas1, int filas2, int columnas1, int columnas2, int[][] matriz1, int[][] matriz2, int[][] matrizResultado
    ) {

        if (columnas1 == filas2) {

            for (int i = 0; i < filas1; i++) {

                for (int j = 0; j < columnas2; j++) {

                    for (int h = 0; h < columnas1; h++) {

                        matrizResultado[i][j] += matriz1[i][h] * matriz2[h][j];

                    }

                }

            }

        } else {

            sop("Los rangos de las matrices son incorrectos. ");

        }

    }

}

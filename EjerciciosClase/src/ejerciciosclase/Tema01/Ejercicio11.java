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

        int[][] matriz1 = solicitarMatriz();

        sop("MATRIZ 1: ");
        imprimirMatriz(matriz1);

        int matriz2[][] = solicitarMatriz();

        sop("MATRIZ 2: ");
        imprimirMatriz(matriz2);

        int matrizResultado[][] = multiplicarMatrices(matriz1, matriz2);

        sop("MATRIZ RESULTADO: ");
        imprimirMatriz(matrizResultado);

    }

    public static int[][] solicitarMatriz() {

        sop("Introduzca las dimensiones de la matriz. ");
        sop("FILAS: ");
        int filas = leerEntero();
        sop("COLUMNAS: ");
        int columnas = leerEntero();

        int[][] matriz = new int[filas][columnas];

        sop("Introduzca los elementos de la matriz. ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = leerEntero();

            }

        }

        return matriz;

    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("" + matriz[i][j] + "");
                System.out.print("\t");

            }
            sop("");

        }

    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {

        int filas1 = matriz1[0].length;
        int columnas2 = matriz2.length;

        int[][] matrizResultado = new int[filas1][columnas2];

        if (matriz1[0].length == matriz2.length) {

            for (int i = 0; i < matriz1.length; i++) {

                for (int j = 0; j < matriz2[i].length; j++) {

                    for (int h = 0; h < matriz1[i].length; h++) {

                        matrizResultado[i][j] += matriz1[i][h] * matriz2[h][j];

                    }

                }

            }

        } else {

            sop("Los rangos de las matrices son incorrectos. ");

        }

        return matrizResultado;

    }

}

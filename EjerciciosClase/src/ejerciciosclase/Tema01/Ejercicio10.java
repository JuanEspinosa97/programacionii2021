package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerEntero;

/**
 * Escribir un programa que rellene una matriz cuadrada (las dimensiones de la
 * matriz serán un parámetro que se pida al usuario) con números aleatorios de
 * tal modo que la matriz sea simétrica. Imprimir la matriz por pantalla.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        System.out.print("Introduzca la dimension de la matriz cuadrada: ");
        int dimension = leerEntero();
        int matrizCuadrada[][] = new int[dimension][dimension];

        rellenarMatriz(matrizCuadrada);
        imprimirMatriz(matrizCuadrada);

    }

    public static void rellenarMatriz(int[][] matrizCuadrada) {

        for (int i = 0; i < matrizCuadrada.length; i++) { // Introducir los valores aleatorios de la matriz

            for (int j = 0; j < matrizCuadrada[i].length; j++) {    //No consigo que sea simetrica

                matrizCuadrada[i][j] = (int) (Math.random() * 9 + 1); // Los numeros aleatorios van del 1 al 10

            }

        }

    }

    public static void imprimirMatriz(int[][] matrizCuadrada) {

        System.out.println("MATRIZ CUADRADA: ");
        for (int i = 0; i < matrizCuadrada.length; i++) { // Representar la matriz

            for (int j = 0; j < matrizCuadrada[i].length; j++) {

                System.out.print(matrizCuadrada[i][j] + " ");

            }
            System.out.println();

        }

    }

}

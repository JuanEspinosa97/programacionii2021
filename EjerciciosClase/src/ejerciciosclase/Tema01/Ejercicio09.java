package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribir un programa que solicite al usuario dos vectores de N elementos y
 * que imprima su producto escalar.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio09 {

    static final int N = 3;

    public static int[] leerVector() {

        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {

            vector[i] = leerEntero();

        }

        return vector;

    }

    public static void imprimirVector(int[] vector) {

        System.out.print("(");

        for (int i = 0; i < N; i++) {

            System.out.print(vector[i]);

            if (i == N - 1) {

                sop(")");
                return;

            }

            System.out.print(",");

        }

    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {

        int productoEscalar = 0;

        for (int i = 0; i < N; i++) {

            productoEscalar += (vector1[i] * vector2[i]); //(3,2)*(1,1)=5

        }

        return productoEscalar;

    }

    public static void main(String[] args) {

        sop("Introduzca el primer vector: ");
        int[] vector1 = leerVector();
        imprimirVector(vector1);
        sop("Introduzca el segundo vector: ");
        int[] vector2 = leerVector();
        imprimirVector(vector2);
        sop("Su producto escalar es: " + calcularProductoEscalar(vector1, vector2));

    }

}

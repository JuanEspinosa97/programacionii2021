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

    static final int N = 2;

    public static void leerVector(int[] vector) {

        for (int i = 0; i < N; i++) {

            vector[i] = leerEntero();

        }

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

    public static void calcularProductoEscalar(int[] vector1, int[] vector2, int[] vectorResultado) {

        for (int i = 0; i < N; i++) {

            vectorResultado[i] = vector1[i] * vector2[i];

        }

    }

    public static void main(String[] args) {

        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        int[] vectorResultado = new int[N];

        sop("Introduzca el primer vector: ");
        leerVector(vector1);
        imprimirVector(vector1);
        sop("Introduzca el segundo vector: ");
        leerVector(vector2);
        imprimirVector(vector2);
        sop("Su producto escalar es: ");
        calcularProductoEscalar(vector1, vector2, vectorResultado);
        imprimirVector(vectorResultado);

    }

}

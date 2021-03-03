package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que muestre por pantalla la lista de los 100 primeros
 * números primos.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio06 {

    static final int TAM = 100;

    public static void calculaPrimos(int[] arrayPrimos) {

        int primos;
        int contador;
        int j = 0;

        for (int i = 1; i <= 100 && j < 100; i++) {

            primos = 1;
            contador = 2;

            while (contador <= i / 2) {

                if (i % contador == 0) {

                    primos = 0;

                }

                contador++;

            }

            if (primos == 1) {

                arrayPrimos[j] = i;

            }

            j++;

        }

    }

    public static void imprimirArrayPrimos(int[] arrayPrimos) {

        for (int i = 0; i < TAM; i++) {

            if (arrayPrimos[i] != 0) {

                sop("" + arrayPrimos[i]);

            }
        }

    }

    public static void main(String[] args) {

        int[] arrayPrimos = new int[TAM];

        sop("Lista de los 100 primeros numeros primos: ");
        calculaPrimos(arrayPrimos);
        imprimirArrayPrimos(arrayPrimos);

    }

}

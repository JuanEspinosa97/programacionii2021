package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100.
 * Calcular además cuántos hay y visualizar cada uno de ellos.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio03 {

    //final MULTIPLOS = 100;
    public static int contarMultiplos() {

        int contador = 0;

        for (int i = 1; i < 100; i++) {

            if (i % 5 == 0) {

                contador++;

            }

        }

        return contador;

    }

    public static int calcularSuma() {

        int suma = 0;

        for (int i = 1; i < 100; i++) {

            if (i % 5 == 0) {

                suma += i;

            }

        }

        return suma;

    }

    public static void leerMultiplos() {

        for (int i = 1; i < 100; i++) {

            if (i % 5 == 0) {

                sop(" " + i);

            }

        }

    }

    public static void main(String[] args) {

        leerMultiplos();
        sop("Hay " + contarMultiplos() + " entre 1 y 100.");
        sop("La suma de los multiplos es: " + calcularSuma());

    }

}

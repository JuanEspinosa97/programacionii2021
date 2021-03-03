package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribe un programa que lea un número entero de teclado y lo descomponga en
 * factores primos; por ejemplo 40 = 2 * 2 * 2 * 5.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio07 {

    public static void imprimirFactores(int enteroLeido) {

        int primos;
        int contador;
        int i;

        System.out.print(enteroLeido + " = ");

        for (i = 2; i <= 100; i++) {

            primos = 1;
            contador = 2;

            while (contador <= i / 2) {

                if (i % contador == 0) {

                    primos = 0;

                }

                contador++;

            }
            if (primos == 1) {

                while (enteroLeido != 0) {

                    if (enteroLeido % i == 0) {

                        System.out.print("" + i);
                        enteroLeido = enteroLeido / i;

                        if (enteroLeido == enteroLeido % i) {

                            break;

                        }
                        System.out.print(" * ");

                    } else {

                        break;

                    }

                }

            }

        }
        sop("");

    }

    public static void main(String[] args) {

        sop("Introduzca un numero para descomponer en factores primos: ");
        int enteroLeido = leerEntero();
        imprimirFactores(enteroLeido);

    }

}

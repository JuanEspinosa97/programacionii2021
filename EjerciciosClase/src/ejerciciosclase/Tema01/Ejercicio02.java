package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribir un programa que muestre por consola los mayores números enteros que
 * se pueden representar mediante un char, short e int.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        sop("Mayor numero entero representable con Integer: " + Integer.MAX_VALUE);
        sop("Mayor numero entero representable con Short: " + Short.MAX_VALUE);
        sop("Mayor numero entero representable con Character: " + (int) Character.MAX_VALUE);

    }

}

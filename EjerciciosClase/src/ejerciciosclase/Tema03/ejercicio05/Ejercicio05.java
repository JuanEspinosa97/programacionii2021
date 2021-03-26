package ejerciciosclase.Tema03.ejercicio05;

import static ejerciciosclase.Utilidades.Utils.leerEntero;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        //Cree un array de Passwords con el tamaño que tú le indiques por teclado.
        System.out.println("Introduzca el numero de contrasenias: ");
        int numC = leerEntero();
        Password[] passwords = new Password[numC];
        /*
        Cree otro array de booleanos donde se almacene si el password del array
        de Password es o no fuerte (usa el bucle anterior).
         */
        boolean[] booleanos = new boolean[numC];

        /*
        Cree un bucle que cree un objeto para cada posición del array. Indica por
        teclado la longitud de cada password.
         */
        for (int i = 0; i < numC; i++) {

            try {
                System.out.println("Longitud de la contrasenia " + (i + 1) + ":");
                passwords[i] = new Password(leerEntero());
                booleanos[i] = passwords[i].esFuerte();
                System.out.println(passwords[i].getContrasenia() + ": " + booleanos[i]);

            } catch (LongitudException ex) {
                System.out.println(ex);
            }
        }

    }
}

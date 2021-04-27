package ejerciciosclase.tema04.ejercicio06;

import static ejerciciosclase.Utilidades.Utils.leerEntero;
import java.io.*;
import static java.lang.System.exit;

/**
 * Crea un programa que permita guardar y cargar del disco duro contactos de una
 * agenda telefónica. Cada contacto, que deberá representarse mediante una
 * clase, constará del nombre de una persona, su e-mail y su número de teléfono.
 * El programa al arrancar, a través de un menú de consola, permitirá al usuario
 * introducir más contactos, listar los contactos existentes, o salir del
 * programa.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio06 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("******AGENDA******");
        System.out.println("*1. Agregar contacto.");
        System.out.println("*2. Listar contactos existentes.");
        System.out.println("*3. Salir del programa.");
        System.out.println("\nElija una opcion: ");
        int opcion = leerEntero();
        Contacto contacto = new Contacto();

        System.out.println(contacto);

        switch (opcion) {

            case 1:

                FileOutputStream fileOutputStream = null;
                ObjectOutputStream objectOutputStream = null;
                File file1 = new File("C:/Users/Juan/Desktop/PROGRAMACIÓN II/LABORATORIO/programacionii2021/EjerciciosClase/src/ejerciciosclase/tema04/ejercicio06/contactos.dat");
                try {

                    fileOutputStream = new FileOutputStream(file1);
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(contacto);

                } catch (IOException ex) {

                    System.out.println("Error antes de finalizar escrituras.");

                } finally {

                    if (fileOutputStream != null)
                        try {
                        fileOutputStream.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    if (objectOutputStream != null)
                        try {
                        objectOutputStream.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }

                break;

            case 2:

                break;

            case 3:
                exit(0);
                break;

        }

    }

}

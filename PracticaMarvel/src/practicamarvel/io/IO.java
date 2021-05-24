package practicamarvel.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import practicamarvel.almacen.AlmacenDatos;

/**
 * Entrada/salida de mi app
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class IO {   //sacado de RacionalIO

    public static final String FICHERO = "practicaMarvel.dat";

    public AlmacenDatos loadDatos() {

        File file = new File(FICHERO);

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        AlmacenDatos datosLeidos = null;
        try {

            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            datosLeidos = (AlmacenDatos) objectInputStream.readObject();

        } catch (Exception e) {
            System.out.println("Error al grabar");
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar.");
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar.");
                e.printStackTrace();
            }
        }
        return datosLeidos;
    }

    public void saveDatos(AlmacenDatos datos) {

        File file = new File(FICHERO);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(datos);

        } catch (Exception e) {
            System.out.println("Error al grabar");
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar.");
                e.printStackTrace();
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar.");
                e.printStackTrace();
            }
        }
    }

}

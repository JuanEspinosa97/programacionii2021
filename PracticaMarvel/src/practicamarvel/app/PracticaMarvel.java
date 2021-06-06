package practicamarvel.app;

import practicamarvel.almacen.AlmacenDatos;
import practicamarvel.io.IO;
import practicamarvel.ui.Interfaz;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class PracticaMarvel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AlmacenDatos datos = IO.loadDatos();    //static definido a nivel de clase
        Interfaz interfaz = new Interfaz(datos);
        interfaz.menu();
        IO.saveDatos(datos);

    }

}

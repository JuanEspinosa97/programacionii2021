package practicamarvel.ui;

import practicamarvel.almacen.AlmacenDatos;
import practicamarvel.io.IO;
import practicamarvel.modelo.escenarios.SanctumSanctorum;
import practicamarvel.modelo.escenarios.StarkTower;
import practicamarvel.modelo.escenarios.XaviersSchool;
import static practicamarvel.utils.Utils.leerCadena;
import static practicamarvel.utils.Utils.leerEntero;

/**
 * La interfaz debería permitir a un jugador configurar la partida (seleccion de
 * escenario y configuracion de equipos y superheroes) y desarrollar el juego en
 * base a la ejecucion de la dinamica de rondas.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Interfaz {

    private AlmacenDatos datos;

    public Interfaz(AlmacenDatos datos) {
        this.datos = datos;

    }

    public void menu() {
        int opcion = opcionMenu();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    String escenario = leerCadena();
                    if (escenario.contains("Sanctum Sanctorum")) {

                        SanctumSanctorum ss = new SanctumSanctorum();

                    } else if (escenario.contains("Stark Tower")) {

                        StarkTower st = new StarkTower();

                    } else if (escenario.contains("Xaviers School")) {

                        XaviersSchool xs = new XaviersSchool();

                    }
                    break;
                case 2:

                    break;
                case 3:

                    IO.saveDatos(datos);

                    break;
            }
            opcion = opcionMenu();
        }
    }

    public int opcionMenu() {

        int opcion = 0;

        while (opcion < 1 || opcion > 4) {
            System.out.println("\n\n=== JUEGO MARVEL ===");
            System.out.println("1. Seleccionar Escenario. ");
            System.out.println("2. Configuracion del equipo. ");
            System.out.println("3. Guardar");
            System.out.println("4. Salir");

            System.out.println("Elija una opcion:");
            opcion = leerEntero();
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion no valida.\n\n");
            }
        }
        return opcion;
    }

}

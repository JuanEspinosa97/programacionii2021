package practicamarvel.modelo.partidas;

import practicamarvel.modelo.escenarios.Escenario;
import practicamarvel.modelo.identificadores.Identificador;
import practicamarvel.modelo.jugadores.Jugador;

/**
 * Enfrenta a dos jugadores y se desarrolla en un escenario. Tiene un
 * identificador unico, de forma que el juego pueda tener almacenadas las
 * partidas. La partida no podra comenzar hasta que los equipos contengan el
 * numero de superheroes y el numero de movimientos establecidos por el
 * escenario.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Partida extends Identificador {

    private Jugador jugador;

    private Escenario escenario;

    public Escenario getEscenario() {
        return escenario;
    }

}

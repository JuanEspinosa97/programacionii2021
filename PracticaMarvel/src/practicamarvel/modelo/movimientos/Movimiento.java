package practicamarvel.modelo.movimientos;

import practicamarvel.modelo.jugadores.Jugador;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Movimiento {

    private Superheroe superheroe;

    private Jugador jugador;

    /**
     * Para cada movimiento, el jugador elegirá el tipo y la cantidad de energia
     * de lucha que desea asignarle. El jugador llamará a este constructor para
     * dicho proposito.
     *
     * @param tipo
     * @param energia
     */
    public Movimiento(TipoMovimiento tipo, int energia) {

    }

}

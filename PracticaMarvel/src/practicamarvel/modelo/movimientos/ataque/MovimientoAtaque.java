package practicamarvel.modelo.movimientos.ataque;

import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.movimientos.TipoMovimiento;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class MovimientoAtaque extends Movimiento {

    public MovimientoAtaque(int energia) {

        super(TipoMovimiento.ATAQUE, energia);

    }

}

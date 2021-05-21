package practicamarvel.modelo.movimientos.defensa;

import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.movimientos.TipoMovimiento;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class MovimientoDefensa extends Movimiento {

    public MovimientoDefensa(int energia) {

        super(TipoMovimiento.DEFENSA, energia);

    }

}

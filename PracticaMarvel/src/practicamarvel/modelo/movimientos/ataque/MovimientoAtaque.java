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

    /**
     * Los porcentajes sirven para calcular, a partir del numero de unidades que
     * tiene asignada cada caracteristica en la parrilla del superheroe, un
     * factor de correccion con el que dicha caracteristica contribuye a mejorar
     * el movimiento. Una vez obtenidos todos los factores, para calcular la
     * contribucion de cada caracteristica en el movimiento, se multiplica cada
     * factor por la energia inicial del movimiento y se divide entre 10. La
     * energia real se obtiene sumando todas las contribuciones obtenidas en la
     * energia inicial del movimiento.
     *
     * @return energia real
     */
    public double calcularEnergiaReal() {

        double fuerza = 0.8 * this.movRealizado.getPoder().getFuerza();
        double velocidad = 0.25 * this.movRealizado.getPoder().getVelocidad();
        double habilidad = 0.75 * this.movRealizado.getPoder().getHabilidad();
        double energia = 1 * this.movRealizado.getPoder().getEnergia();

        return this.getEnergia() + (fuerza * this.getEnergia() + velocidad * this.getEnergia() + habilidad * this.getEnergia() + energia * this.getEnergia()) / 10;

    }

}

package practicamarvel.modelo.escenarios;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class StarkTower extends Escenario {

    public static final String NOMBRE = "Stark Tower";
    public static final int MONEDAS = 20000;
    public static final int MIEMBROS = 20;
    public static final int MOVIMIENTOS = 25;
    public static final int ENERGIA = 200;

    public StarkTower() {

        super(NOMBRE, MONEDAS, MIEMBROS, MOVIMIENTOS, ENERGIA);

    }

}

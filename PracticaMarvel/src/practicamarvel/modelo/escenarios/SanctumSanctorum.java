package practicamarvel.modelo.escenarios;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class SanctumSanctorum extends Escenario {

    public static final String NOMBRE = "Sanctum Sanctorum";
    public static final int MONEDAS = 10000;
    public static final int MIEMBROS = 10;
    public static final int MOVIMIENTOS = 10;
    public static final int ENERGIA = 100;

    public SanctumSanctorum() {

        super(NOMBRE, MONEDAS, MIEMBROS, MOVIMIENTOS, ENERGIA);

    }

    /*
    @Override
    public String toString() {

        return "Nombre: " + NOMBRE
                + "\nMonedas: " + MONEDAS
                + "\nMiembros: " + MIEMBROS
                + "\nMovimientos: " + MOVIMIENTOS
                + "\nEnergia: " + ENERGIA;

    }
     */
}

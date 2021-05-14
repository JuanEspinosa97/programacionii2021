package practicamarvel.modelo.superheroes;

import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.escenarios.Escenario;
import practicamarvel.modelo.identificadores.Identificador;
import practicamarvel.modelo.jugadores.Jugador;
import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Superheroe extends Identificador {

    private String alias;
    private String identidad;

    private List<Movimiento> movimientos;

    private ParrillaDePoder poderes;

    private final int coste;
    private final int recompensa;

    private int energiaVital;
    private int energiaLucha;

    private Escenario escenario;

    private Jugador jugador;

    public Superheroe(String alias, String identidad) {

        super();
        this.alias = alias;
        this.identidad = identidad;
        this.movimientos = new ArrayList();
        this.coste = (escenario.getMonedasIniciales() / escenario.getIntegrantes()) * (poderes.sumaPoderes() / 30); // si el jugador pertenece a la misma organizacion que el superheroe se le rebaja un 20%
        this.recompensa = this.coste * (poderes.mediaPoderes() / 7);
        this.energiaVital = escenario.getEnergia() * poderes.getResistencia();
        this.energiaLucha = escenario.getMovimientos() * 150;

    }

}

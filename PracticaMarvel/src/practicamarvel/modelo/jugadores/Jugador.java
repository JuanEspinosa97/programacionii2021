package practicamarvel.modelo.jugadores;

import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.partidas.Partida;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 * El jugador tiene un equipo de superheroes. Se identifica con un alias (que es
 * un identificador unico), tiene un numero de monedas, cuenta con un centro de
 * mando (para controlar la partida) y puede afiliarse a una organizacion de
 * superheroes.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Jugador {

    private final String alias;

    private final Organizacion organizacion;

    private final List<Superheroe> superheroes;

    /* Cada jugador deberá configurar tantos movimientos como establezca el escenario*/
    private List<Movimiento> movimientos;

    private final int monedas;

    private Partida partida;

    public Jugador(String alias, Organizacion organizacion, int monedas) {

        this.alias = alias;
        this.organizacion = organizacion;
        this.monedas = monedas;
        this.superheroes = new ArrayList();

    }

    public String getAlias() {
        return alias;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public List<Superheroe> getSuperheroes() {
        return superheroes;
    }

    public int getMonedas() {
        return monedas;
    }

    public Partida getPartida() {
        return partida;
    }

}

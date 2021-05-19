package practicamarvel.modelo.jugadores;

import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.partidas.Partida;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Jugador {

    private final String alias;

    private final Organizacion organizacion;

    private final List<Superheroe> superheroes;

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

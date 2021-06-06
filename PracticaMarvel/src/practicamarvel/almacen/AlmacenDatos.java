package practicamarvel.almacen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.partidas.Partida;

/**
 * El juego puede tener almacenadas distintas partidas a punto de comenzar o ya
 * finalizadas (a modo de historico).
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class AlmacenDatos implements Serializable {

    private List<Partida> casiComenzadas;
    private List<Partida> finalizadas;

    public AlmacenDatos() {

        this.casiComenzadas = new ArrayList();
        this.finalizadas = new ArrayList();

    }

    public List<Partida> getCasiComenzadas() {
        return casiComenzadas;
    }

    public List<Partida> getFinalizadas() {
        return finalizadas;
    }

    public void aniadirPartidaCasiComenzadas(Partida partida) {

        this.casiComenzadas.add(partida);

    }

    public void aniadirPartidaFinalizadasPartida(Partida partida) {

        this.finalizadas.add(partida);

    }

    public void borrarPartidaCasiComenmzadas(Partida partida) {

        this.casiComenzadas.remove(partida);

    }

    public void borrarPartidaFinalizadas(Partida partida) {

        this.finalizadas.remove(partida);

    }

}

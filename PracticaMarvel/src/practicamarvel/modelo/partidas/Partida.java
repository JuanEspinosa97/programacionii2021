package practicamarvel.modelo.partidas;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import practicamarvel.modelo.escenarios.Escenario;
import practicamarvel.modelo.identificadores.Identificador;
import practicamarvel.modelo.jugadores.Jugador;
import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.superheroes.CompararSuperheroesEnergia;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 * Enfrenta a dos jugadores y se desarrolla en un escenario. Tiene un
 * identificador unico, de forma que el juego pueda tener almacenadas las
 * partidas. La partida no podra comenzar hasta que los equipos contengan el
 * numero de superheroes y el numero de movimientos establecidos por el
 * escenario.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Partida extends Identificador {

    private Escenario escenario;

    private Jugador jugador1;

    private Jugador jugador2;

    private int turno;

    private Jugador ganador;

    /**
     * Se selecciona un escenario donde tendra lugar la lucha entre equipos.
     * Este escenario establecera las monedas iniciales disponibles para cada
     * jugador, numero de miembros que debera tener el equipo de superheroes de
     * cada jugador, numero de movimientos que debera establecer el jugador y la
     * energia vital inicial para los superheroes. Cada jugador configurara su
     * equipo. Seleccionara uno a uno los distintos superheroes que quiera en su
     * equipo. Cada vez que aniada un superheroe al equipo, se descontara de sus
     * monedas iniciales el coste del superheroe. Debera seleccionar tantos
     * superheroes como establezca el escenario. No se pueden realizar compras
     * de superheroes si no hay dinero suficiente. Por cada superheroe, el
     * jugador debera determinar el orden y los distintos movimientos que querra
     * que realice ese superheroe. Lo hara a ciegas, sin saber cual sera su
     * contrincante ni que movimiento realizara el contrario. Debera completar
     * todos los movimientos necesarios que haya determinado el escenario. Una
     * vez configurados los equipos comenzara la simulacion de lucha.
     */
    public Partida(Escenario escenario, Jugador jugador1, Jugador jugador2) {

        super();
        this.escenario = escenario;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = 0;
        this.ganador = null;

    }

    public Escenario getEscenario() {
        return escenario;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getTurno() {
        return turno;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public Jugador getJugadorMano() {

        if (this.turno % 2 == 0) {

            return this.jugador1;

        } else {

            return this.jugador2;

        }

    }

    public Jugador getJugadorOponente() {

        if (this.turno % 2 != 0) {

            return this.jugador1;

        } else {

            return this.jugador2;

        }

    }

    public void ronda() {    //ordenarlos.TreeSet() compareTo. clase aparte. se enfrentan de manera aleatoria

        //En primer lugar, ordeno los superheroes por energia
        Set<Superheroe> s1 = new TreeSet();
        s1.addAll(this.getJugadorMano().getSuperheroes());
        List<Superheroe> s2 = new ArrayList(s1);

        //Despues los comparo por su energia
        Set<Superheroe> s3 = new TreeSet(new CompararSuperheroesEnergia());
        s3.addAll(this.getJugadorOponente().getSuperheroes());
        List<Superheroe> s4 = new ArrayList(s3);

        int lucha;

        if (s2.size() > s4.size()) {

            lucha = s4.size();

        } else {

            lucha = s2.size();

        }

        for (int i = 0; i < lucha; i++) {

            Movimiento m1 = s2.get(i).pelear(s4.get(i));
            Movimiento m2 = s4.get(i).pelear(s2.get(i));

        }

        //Ahora compruebo quedan superheroes vivos en ambos equipos. De lo contrario se elige al ganador.
        if (jugador1.quedanSuperheroes() && jugador2.quedanSuperheroes()) {

            turno++;

        } else {

            if (jugador1.getSuperheroes().size() == jugador2.getSuperheroes().size()) {

                if (jugador1.getEnergiaDelEquipo() > jugador2.getEnergiaDelEquipo()) {

                    ganador = jugador1;

                } else {

                    ganador = jugador2;

                }

            } else {

                if (jugador1.getSuperheroes().size() > jugador2.getSuperheroes().size()) {

                    ganador = jugador1;

                } else {

                    ganador = jugador2;

                }

            }

        }

    }

}

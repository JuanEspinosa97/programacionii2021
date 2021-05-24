package practicamarvel.modelo.superheroes;

import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.escenarios.Escenario;
import practicamarvel.modelo.identificadores.Identificador;
import practicamarvel.modelo.jugadores.Jugador;
import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.organizaciones.Organizacion;

/**
 * El superheroe cuenta con una energia vital y un conjunto de movimientos.
 * Ademas posee un conjunto de caracteristicas (Power grid). Permiten modular
 * movimientos de ataque y defensa. Pueden ser mejoradas por el jugador al
 * inicio de la partida.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Superheroe extends Identificador {    //la defino como abstracta para que no pueda ser instanciada (new).

    private final String alias; // los defino con el modificador final para que no pueda ser cambiado su valor una vez asignado uno
    private final String identidad;
    private final Organizacion organizacion;

    /* Cada superheroe posee un conjunto de movimientos. Los superheroes realizan movimientos. */
    private final List<Movimiento> movimientos;

    private final PoderesMinMax poderes;

    private ParrillaDePoder poder;

    private int coste;
    private int recompensa;

    private int energiaVital;
    private int energiaLucha;

    private Escenario escenario;

    private Jugador jugador;    //para acceder al escenario y asi obtener su coste y recompensa

    /**
     * Constructor de superheroe. El superheroe tiene un alias, una identidad
     * secreta, poderes y pertenece a una organizacion. Su coste, su recompensa
     * y su energia se obtienen en los getters.
     *
     * @param alias "Nombre molon"
     * @param identidad identidad secreta
     * @param organizacion el superheroe pertenece a una organizacion
     * @param poderes poderes del superheroe
     */
    public Superheroe(String alias, String identidad, Organizacion organizacion, PoderesMinMax poderes) {

        super();
        this.alias = alias;
        this.identidad = identidad;
        this.organizacion = organizacion;
        this.poderes = poderes;
        this.movimientos = new ArrayList();

    }

    /* Getters */
    /**
     * Se obtiene el alias del superheroe
     *
     * @return alias
     */
    public String getAlias() {
        return alias;

    }

    // No hago getter de identidad secreta puesto que, como su nombre indica, es secreta y no debe facilitarse.
    /**
     * Se obtiene la organizacion a la que pertenece el superheroe
     *
     * @return organizacion
     */
    public Organizacion getOrganizacion() {
        return organizacion;
    }

    /**
     * Se obtiene el conjunto de movimientos de defensa/ataque.
     *
     * @return movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Se obtiene lo que cuesta comprar un superheroe. Para esto, tenemos en
     * cuenta las monedas iniciales que te proporciona el escenario, el numero
     * de miembros del equipo y la suma de poderes del jugador. Si el jugador
     * pertenece a la misma organizacion que el superheroe, se le hace una
     * rebaja del 20%.
     *
     * @return coste
     */
    public int getCoste() {
        int coste = (jugador.getPartida().getEscenario().getMonedasIniciales() / jugador.getPartida().getEscenario().getIntegrantes()) * (poder.calcularSumaPoderes() / 30);
        if (jugador.getOrganizacion().equals(this.organizacion)) {

            coste = (int) (coste * 0.8); // sería equivalente a multiplicar por 0.2 y restarselo al inicial

        }

        return coste;
    }

    /**
     * Se obtiene la recompensa por "cargarse" a un superheroe enemigo. Se
     * calcula multiplicando su coste por la media de poderes del jugador entre
     * siete.
     *
     * @return recompensa
     */
    public int getRecompensa() {
        return recompensa = this.getCoste() * (poder.calcularMediaPoderes() / 7);
    }

    /**
     * Se obtiene la energia vital del superheroe.
     *
     * @return energiaVital
     */
    public int getEnergiaVital() {
        return energiaVital;
    }

    /**
     * Se obtiene la energia de lucha del superheroe.
     *
     * @return energiaLucha
     */
    public int getEnergiaLucha() {
        return energiaLucha;
    }

    /**
     * Las clases hijas acceden a este get para determinar sus poderes
     *
     * @return
     */
    public ParrillaDePoder getPoder() {
        return poder;
    }

    public PoderesMinMax getPoderes() {
        return poderes;
    }

    /**
     * Se obtiene el atributo jugador de la clase Jugador.
     *
     * @return jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /*Setters*/
    public void setEnergiaVital(int energiaVital) {
        this.energiaVital = energiaVital;
    }

    public void setEnergiaLucha(int energiaLucha) {
        this.energiaLucha = energiaLucha;
    }

    /**
     * Cada superheroe tiene una energia en concreto. La energia vital depende
     * del escenario y se contabiliza como su energia por el valor de la
     * resistencia de la parrilla de poderes. La energia de la lucha se
     * contabiliza como el numero de movimientos permitidos por el escenario por
     * 150.
     *
     * @param jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
        this.setEnergiaVital(jugador.getPartida().getEscenario().getEnergia() * this.getPoder().getResistencia());
        this.setEnergiaLucha(jugador.getPartida().getEscenario().getMovimientos() * 150);

    }

    /*
    @Override
    public String toString() {

        String movs = "";
        for (Movimiento movimiento : movimientos) {

            movs += movimiento.toString() + "\n";

        }

        return "Superheroe: \n"
                + "Alias: " + alias + "\n"
                + "Identidad Secreta: " + identidad + "\n"
                + "Organizacion: " + organizacion + "\n"
                + "Poderes: " + poderes + "\n"
                + "Movimientos: " + movs + "\n";

    }

     */
}

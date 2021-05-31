package practicamarvel.modelo.jugadores;

import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.excepciones.EnergiaInsuficienteException;
import practicamarvel.modelo.excepciones.EquipoCompletoException;
import practicamarvel.modelo.excepciones.MovimientosExcedidosException;
import practicamarvel.modelo.excepciones.SuperheroeNoEncontradoException;
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

    private int monedas;

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

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Para comprar un superheroe comprobamos antes que tenemos dinero
     * suficiente y que cabe en nuestro equipo. A continuacion restamos a
     * nuestro presupuesto lo que nos ha costado el superheroe.
     *
     * @param superheroe
     * @throws EquipoCompletoException
     */
    public void comprarSuperheroe(Superheroe superheroe) throws EquipoCompletoException {

        if (this.monedas >= superheroe.getCoste()) {

            if (this.superheroes.size() < this.partida.getEscenario().getIntegrantes()) {

                this.monedas = this.monedas - superheroe.getCoste();
                this.superheroes.add(superheroe);

            } else {

                throw new EquipoCompletoException();

            }

        }

    }

    /**
     * Para comprar un movimiento antes debemos asegurarnos de que dicho
     * superheroe se encuentra en la lista.
     *
     * @param superheroe
     * @param movimiento
     * @throws SuperheroeNoEncontradoException
     * @throws EnergiaInsuficienteException
     * @throws MovimientosExcedidosException
     */
    public void comprarMovimiento(Superheroe superheroe, Movimiento movimiento) throws SuperheroeNoEncontradoException, EnergiaInsuficienteException, MovimientosExcedidosException {

        if (this.superheroes.contains(superheroe)) {

            superheroe.aniadirMovimiento(movimiento);

        } else {

            throw new SuperheroeNoEncontradoException();

        }

    }

    /**
     * Eliminar un superheroe de la lista.
     *
     * @param superheroe
     */
    public void eliminarSuperheroe(Superheroe superheroe) {

        this.superheroes.remove(superheroe);

    }
}

package practicamarvel.modelo.movimientos;

import practicamarvel.modelo.superheroes.Superheroe;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Movimiento {

    private TipoMovimiento tipo;

    private int energia;    //esta es mi energia de lucha

    private double energiaReal; //esta es mi energia real que depende de la parrilla de poderes

    public Superheroe movRealizado;    //movimientos realizados por un superheroe. Lo pongo como publico para que sus clases hijas puedan acceder.

    private Superheroe movDirigido; //movimientos dirigidos a un superheroe

    /**
     * Para cada movimiento, el jugador elegirá el tipo y la cantidad de energia
     * de lucha que desea asignarle. El jugador llamará a este constructor para
     * dicho proposito.
     *
     * @param tipo
     * @param energia
     */
    public Movimiento(TipoMovimiento tipo, int energia) {

        this.tipo = tipo;
        this.energia = energia;
        this.energiaReal = 0;
        this.movRealizado = null;
        this.movDirigido = null;

    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public int getEnergia() {
        return energia;
    }

    public double getEnergiaReal() {
        return energiaReal;
    }

    public Superheroe getMovRealizado() {
        return movRealizado;
    }

    public Superheroe getMovDirigido() {
        return movDirigido;
    }

    public abstract double calcularEnergiaReal();

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEnergiaReal(double energiaReal) {
        this.energiaReal = energiaReal;
    }

    public void setMovRealizado(Superheroe movRealizado) {
        this.movRealizado = movRealizado;
    }

    public void setMovDirigido(Superheroe movDirigido) {
        this.movDirigido = movDirigido;
    }

}

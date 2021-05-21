package practicamarvel.modelo.escenarios;

/**
 * Se corresponden con localizaciones famosas del universo Marvel. Establece
 * para cada jugador, un numero de monedas iniciales, restringiendo el numero de
 * miembros del equipo. Tambien restringira el numero de movimientos que cada
 * superheroe pueda hacer en su lucha.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Escenario {

    private String titulo;
    private int monedasIniciales;
    private int integrantes;
    private int movimientos;
    private int energia;

    public Escenario(String titulo, int monedasIniciales, int integrantes, int movimientos, int energia) {

        this.titulo = titulo;
        this.monedasIniciales = monedasIniciales;
        this.integrantes = integrantes;
        this.movimientos = movimientos;
        this.energia = energia;

    }

    public int getMonedasIniciales() {
        return monedasIniciales;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public int getEnergia() {
        return energia;
    }

}

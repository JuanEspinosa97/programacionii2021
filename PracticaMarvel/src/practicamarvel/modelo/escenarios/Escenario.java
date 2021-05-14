package practicamarvel.modelo.escenarios;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Escenario {

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

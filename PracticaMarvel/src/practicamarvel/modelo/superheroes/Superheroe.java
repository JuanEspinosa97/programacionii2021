package practicamarvel.modelo.superheroes;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Superheroe {

    private int identificador;
    private String alias;
    private String identidad;
    private int movimientos;
    private String poderes;
    private double coste;
    private double recompensa;

    public Superheroe(int identificador, String alias, String identidad, int movimientos,
            String poderes, double coste, double recompensa) {

        this.identificador = identificador;
        this.alias = alias;
        this.identidad = identidad;
        this.movimientos = movimientos;
        this.poderes = poderes;
        this.coste = coste;
        this.recompensa = recompensa;

    }

}

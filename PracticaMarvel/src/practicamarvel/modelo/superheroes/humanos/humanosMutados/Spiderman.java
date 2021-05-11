package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Spiderman extends HumanoMutado {

    public static final String ALIAS = "Spiderman";
    public static final String IDENTIDAD = "Peter Parker";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Spiderman() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Mutado";
        this.afiliacion = "Liga de los Reinos";
        this.poderes = new ParrillaDePoder(4, 4, 3, 3, 1, 4);
    }

}

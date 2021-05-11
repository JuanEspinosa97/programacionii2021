package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Deadpool extends HumanoMejorado {

    public static final String ALIAS = "Deadpool";
    public static final String IDENTIDAD = "Wade Wilson";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Deadpool() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Mejorado";
        this.afiliacion = "Mercenarios";
        this.poderes = new ParrillaDePoder(3, 4, 2, 4, 1, 5);
    }

}

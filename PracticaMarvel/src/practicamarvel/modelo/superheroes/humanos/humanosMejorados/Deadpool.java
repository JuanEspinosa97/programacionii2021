package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Deadpool extends HumanoMejorado {

    public static final String ALIAS = "Deadpool";
    public static final String IDENTIDAD = "Wade Wilson";

    private ParrillaDePoder poderes;

    public Deadpool() {
        super(ALIAS, IDENTIDAD, Organizacion.MERCENARIOS);
        this.poderes = new ParrillaDePoder(3, 4, 2, 4, 1, 5);

    }

}

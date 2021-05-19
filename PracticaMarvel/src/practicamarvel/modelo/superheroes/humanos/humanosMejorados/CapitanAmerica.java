package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class CapitanAmerica extends HumanoMejorado {

    public static final String ALIAS = "Capitan America";
    public static final String IDENTIDAD = "Steve Rogers";

    private ParrillaDePoder poderes;

    public CapitanAmerica() {
        super(ALIAS, IDENTIDAD, Organizacion.VENGADORES);
        this.poderes = new ParrillaDePoder(3, 2, 2, 3, 1, 5);

    }

}

package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class IronMan extends HumanoMejorado {

    public static final String ALIAS = "Iron Man";
    public static final String IDENTIDAD = "Anthony Stark";

    private ParrillaDePoder poderes;

    public IronMan() {
        super(ALIAS, IDENTIDAD, Organizacion.VENGADORES);
        this.poderes = new ParrillaDePoder(6, 6, 5, 5, 6, 5);

    }

}

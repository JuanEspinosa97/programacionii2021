package practicamarvel.modelo.superheroes.humanos.humanosMagicos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class DrStrange extends HumanoMagico {

    public static final String ALIAS = "Dr. Strange";
    public static final String IDENTIDAD = "Stephen Strange";
    private ParrillaDePoder poderes;

    public DrStrange() {
        super(ALIAS, IDENTIDAD, Organizacion.ACADEMIA_DOCTOR_STRANGE);
        this.poderes = new ParrillaDePoder(4, 2, 2, 2, 6, 6);

    }

}

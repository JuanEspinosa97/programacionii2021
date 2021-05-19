package practicamarvel.modelo.superheroes.humanos.humanosMagicos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class BrujaEscarlata extends HumanoMagico {

    public static final String ALIAS = "Bruja Escarlata";
    public static final String IDENTIDAD = "Wanda Maximoff";

    private ParrillaDePoder poderes;

    public BrujaEscarlata() {
        super(ALIAS, IDENTIDAD, Organizacion.ACADEMIA_DOCTOR_STRANGE);
        this.poderes = new ParrillaDePoder(3, 2, 2, 2, 6, 3);

    }

}

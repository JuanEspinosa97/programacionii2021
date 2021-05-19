package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class AngelAsesino extends Asgardiano {

    public static final String ALIAS = "Angel Asesino";
    public static final String IDENTIDAD = "Aldrif Odinsdottir";

    private ParrillaDePoder poderes;

    public AngelAsesino() {
        super(ALIAS, IDENTIDAD, Organizacion.LIGA_DE_LOS_REINOS);
        this.poderes = new ParrillaDePoder(2, 7, 3, 3, 1, 6);

    }

}

package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class AngelAsesino extends Asgardiano {

    public static final String ALIAS = "Angel Asesino";
    public static final String IDENTIDAD = "Aldrif Odinsdottir";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public AngelAsesino() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Asgardiano";
        this.afiliacion = "Liga de los Reinos";
        this.poderes = new ParrillaDePoder(2, 7, 3, 3, 1, 6);
    }

}

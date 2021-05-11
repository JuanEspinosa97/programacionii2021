package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Thor extends Asgardiano {

    public static final String ALIAS = "Thor";
    public static final String IDENTIDAD = "Thor Odinson";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Thor() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Asgardiano";
        this.afiliacion = "Liga de los Reinos";
        this.poderes = new ParrillaDePoder(2, 7, 7, 6, 6, 4);
    }

}

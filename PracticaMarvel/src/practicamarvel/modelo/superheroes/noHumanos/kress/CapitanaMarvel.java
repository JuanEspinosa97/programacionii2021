package practicamarvel.modelo.superheroes.noHumanos.kress;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class CapitanaMarvel extends Kress {

    public static final String ALIAS = "Capitana Marvel";
    public static final String IDENTIDAD = "Carol Danvers";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public CapitanaMarvel() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Kree";
        this.afiliacion = "A-Force";
        this.poderes = new ParrillaDePoder(4, 5, 5, 6, 5, 4);
    }

}

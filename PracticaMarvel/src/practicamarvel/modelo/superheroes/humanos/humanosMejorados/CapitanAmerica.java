package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class CapitanAmerica extends HumanoMejorado {

    public static final String ALIAS = "Capitan America";
    public static final String IDENTIDAD = "Steve Rogers";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public CapitanAmerica() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Mejorado";
        this.afiliacion = "Vengadores";
        this.poderes = new ParrillaDePoder(3, 3, 2, 3, 1, 5);
    }

}

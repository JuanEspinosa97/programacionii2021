package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class IronMan extends HumanoMejorado {

    public static final String ALIAS = "Iron Man";
    public static final String IDENTIDAD = "Anthony Stark";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public IronMan() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Mejorado";
        this.afiliacion = "Vengadores";
        this.poderes = new ParrillaDePoder(6, 6, 5, 5, 6, 5);

    }

}

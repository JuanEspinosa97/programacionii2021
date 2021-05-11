package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ViudaNegra extends HumanoMejorado {

    public static final String ALIAS = "Viuda Negra";
    public static final String IDENTIDAD = "Natalia Romanov";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public ViudaNegra() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Mejorado";
        this.afiliacion = "Vengadores";
        this.poderes = new ParrillaDePoder(3, 3, 2, 3, 3, 5);
    }

}

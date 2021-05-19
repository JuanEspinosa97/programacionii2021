package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ViudaNegra extends HumanoMejorado {

    public static final String ALIAS = "Viuda Negra";
    public static final String IDENTIDAD = "Natalia Romanov";

    private ParrillaDePoder poderes;

    public ViudaNegra() {
        super(ALIAS, IDENTIDAD, Organizacion.VENGADORES);
        this.poderes = new ParrillaDePoder(3, 3, 2, 3, 3, 5);

    }

}

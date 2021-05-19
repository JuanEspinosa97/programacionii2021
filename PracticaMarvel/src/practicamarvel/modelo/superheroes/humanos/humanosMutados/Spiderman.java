package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Spiderman extends HumanoMutado {

    public static final String ALIAS = "Spiderman";
    public static final String IDENTIDAD = "Peter Parker";

    private ParrillaDePoder poderes;

    public Spiderman() {
        super(ALIAS, IDENTIDAD, Organizacion.LIGA_DE_LOS_REINOS);
        this.poderes = new ParrillaDePoder(4, 4, 3, 3, 1, 4);

    }

}

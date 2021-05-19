package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Domino extends HomoSuperior {

    public static final String ALIAS = "Domino";
    public static final String IDENTIDAD = "Neena Thurman";

    private ParrillaDePoder poderes;

    public Domino() {
        super(ALIAS, IDENTIDAD, Organizacion.MERCENARIOS);
        this.poderes = new ParrillaDePoder(2, 2, 2, 2, 4, 6);

    }

}

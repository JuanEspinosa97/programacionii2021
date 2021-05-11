package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Domino extends HomoSuperior {

    public static final String ALIAS = "Domino";
    public static final String IDENTIDAD = "Neena Thurman";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Domino() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Homo Superior";
        this.afiliacion = "Mercenarios";
        this.poderes = new ParrillaDePoder(2, 2, 2, 2, 4, 6);

    }

}

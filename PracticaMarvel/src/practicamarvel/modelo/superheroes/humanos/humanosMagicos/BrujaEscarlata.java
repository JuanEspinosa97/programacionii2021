package practicamarvel.modelo.superheroes.humanos.humanosMagicos;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class BrujaEscarlata extends HumanoMagico {

    public static final String ALIAS = "Bruja Escarlata";
    public static final String IDENTIDAD = "Wanda Maximoff";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public BrujaEscarlata() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Magico";
        this.afiliacion = "Strange Academy";
        this.poderes = new ParrillaDePoder(3, 2, 2, 2, 6, 3);

    }

}

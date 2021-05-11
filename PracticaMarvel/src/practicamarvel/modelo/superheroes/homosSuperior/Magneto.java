package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Magneto extends HomoSuperior {

    public static final String ALIAS = "Magneto";
    public static final String IDENTIDAD = "Eric Lensher";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Magneto() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Homo Superior";
        this.afiliacion = "X-Men";
        this.poderes = new ParrillaDePoder(5, 2, 5, 2, 6, 4);
    }

}

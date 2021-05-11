package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Lobezno extends HomoSuperior {

    public static final String ALIAS = "Lobezno";
    public static final String IDENTIDAD = "James Logan Howlett";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Lobezno() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Homo Superior";
        this.afiliacion = "X-Men";
        this.poderes = new ParrillaDePoder(2, 4, 2, 3, 2, 4);

    }

}

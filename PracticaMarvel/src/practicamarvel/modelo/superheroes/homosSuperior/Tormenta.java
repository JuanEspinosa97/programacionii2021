package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Tormenta extends HomoSuperior {

    public static final String ALIAS = "Tormenta";
    public static final String IDENTIDAD = "Ororo Munroe";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public Tormenta() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Homo Superior";
        this.afiliacion = "X-Men";
        this.poderes = new ParrillaDePoder(3, 2, 3, 2, 5, 4);

    }

}

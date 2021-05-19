package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Lobezno extends HomoSuperior {

    public static final String ALIAS = "Lobezno";
    public static final String IDENTIDAD = "James Logan Howlett";

    private ParrillaDePoder poderes;

    public Lobezno() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        this.poderes = new ParrillaDePoder(2, 4, 2, 3, 2, 4);

    }

}

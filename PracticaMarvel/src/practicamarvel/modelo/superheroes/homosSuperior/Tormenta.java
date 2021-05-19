package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Tormenta extends HomoSuperior {

    public static final String ALIAS = "Tormenta";
    public static final String IDENTIDAD = "Ororo Munroe";

    private ParrillaDePoder poderes;

    public Tormenta() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        this.poderes = new ParrillaDePoder(3, 2, 3, 2, 5, 4);

    }

}

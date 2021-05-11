package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ChicaMarvel extends HomoSuperior {

    public static final String ALIAS = "Chica Marvel";
    public static final String IDENTIDAD = "Jean Grey";
    private String origen;
    private Organizacion afiliacion;
    private ParrillaDePoder poderes;

    //Identificador?
    public ChicaMarvel() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Homo Superior";
        this.afiliacion = Organizacion.X_MEN;
        this.poderes = new ParrillaDePoder(3, 2, 3, 2, 6, 4);
    }

}

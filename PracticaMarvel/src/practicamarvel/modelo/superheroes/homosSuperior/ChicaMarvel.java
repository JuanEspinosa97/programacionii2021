package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.superheroes.ParrillaDePoderes;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ChicaMarvel extends HomoSuperior {

    public static final String ALIAS = "Chica Marvel";
    public static final String IDENTIDAD = "Jean Grey";
    private String origen;
    private String afiliacion;
    private ParrillaDePoderes poderes;

    //Identificador?
    public ChicaMarvel() {
        super(ALIAS, IDENTIDAD, movimientos, poderes, coste, recompensa);
        this.origen = "Homo Superior";
        this.afiliacion = "X-Men";
        this.poderes = new ParrillaDePoderes(3, 2, 3, 2, 6, 4);
    }

}

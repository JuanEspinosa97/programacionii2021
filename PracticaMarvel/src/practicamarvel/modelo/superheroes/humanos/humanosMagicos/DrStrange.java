package practicamarvel.modelo.superheroes.humanos.humanosMagicos;

import practicamarvel.modelo.superheroes.ParrillaDePoderes;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class DrStrange extends HumanoMagico {

    public static final String ALIAS = "Dr. Strange";
    public static final String IDENTIDAD = "Stephen Strange";
    private String origen;
    private String afiliacion;
    private ParrillaDePoderes poderes;

    public DrStrange() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Magico";
        this.afiliacion = "Strange Academy";
        this.poderes = new ParrillaDePoderes(4, 2, 2, 2, 6, 6);
    }

}

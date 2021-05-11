package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class SheHulk extends HumanoMutado {

    public static final String ALIAS = "She-Hulk";
    public static final String IDENTIDAD = "Jennifer Walters";
    private String origen;
    private String afiliacion;
    private ParrillaDePoder poderes;

    public SheHulk() {
        super(ALIAS, IDENTIDAD);
        this.origen = "Humano Mutado";
        this.afiliacion = "A-Force";
        this.poderes = new ParrillaDePoder(3, 7, 3, 5, 1, 4);
    }

}

package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ChicaMarvel extends HomoSuperior {

    public static final String ALIAS = "Chica Marvel";
    public static final String IDENTIDAD = "Jean Grey";

    private final ParrillaDePoder poderes;

    public ChicaMarvel() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        this.poderes = new ParrillaDePoder(3, 2, 3, 2, 6, 4);
        this.getPoder().setInteligencia(3);
    }

    @Override
    public String toString() {

        return "Alias: " + ALIAS
                + "\nIdentidad: " + IDENTIDAD
                + "\nOrganizacion: " + Organizacion.X_MEN
                + "\nParrilla de poderes: " + poderes;

    }

}

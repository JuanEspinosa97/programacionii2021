package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ChicaMarvel extends HomoSuperior {

    public static final String ALIAS = "Chica Marvel";
    public static final String IDENTIDAD = "Jean Grey";

    //private final ParrillaDePoder poderes;    NULL POINTER EXCEPTION
    public ChicaMarvel() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        //this.poderes = new ParrillaDePoder(3, 2, 3, 2, 6, 4);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(2);
        this.getPoder().setVelocidad(3);
        this.getPoder().setEnergia(6);
        this.getPoder().setHabilidad(4);
    }

    @Override
    public String toString() {

        return "Alias: " + ALIAS
                + "\nIdentidad: " + IDENTIDAD
                + "\nOrganizacion: " + Organizacion.X_MEN
                + "\nParrilla de poderes: ";

    }

}

package practicamarvel.modelo.superheroes.noHumanos.kress;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class CapitanaMarvel extends Kress {

    public static final String ALIAS = "Capitana Marvel";
    public static final String IDENTIDAD = "Carol Danvers";

    // private ParrillaDePoder poderes;
    public CapitanaMarvel() {
        super(ALIAS, IDENTIDAD, Organizacion.A_FORCE);
        //this.poderes = new ParrillaDePoder(4, 5, 5, 6, 5, 4);
        this.getPoder().setInteligencia(4);
        this.getPoder().setFuerza(5);
        this.getPoder().setVelocidad(5);
        this.getPoder().setResistencia(6);
        this.getPoder().setEnergia(5);
        this.getPoder().setHabilidad(4);

    }

    @Override
    public String toString() {

        return "Alias: " + ALIAS
                + "\nIdentidad: " + IDENTIDAD
                + "\nOrganizacion: " + Organizacion.A_FORCE
                + "\nParrilla de poderes: ";

    }

}

package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Deadpool extends HumanoMejorado {

    public static final String ALIAS = "Deadpool";
    public static final String IDENTIDAD = "Wade Wilson";

    // private ParrillaDePoder poderes;
    public Deadpool() {
        super(ALIAS, IDENTIDAD, Organizacion.MERCENARIOS);
        // this.poderes = new ParrillaDePoder(3, 4, 2, 4, 1, 5);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(4);
        this.getPoder().setVelocidad(2);
        this.getPoder().setResistencia(4);
        this.getPoder().setEnergia(1);
        this.getPoder().setHabilidad(5);

    }

}

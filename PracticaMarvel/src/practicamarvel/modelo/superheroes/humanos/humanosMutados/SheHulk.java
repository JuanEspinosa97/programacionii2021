package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class SheHulk extends HumanoMutado {

    public static final String ALIAS = "She-Hulk";
    public static final String IDENTIDAD = "Jennifer Walters";

    //private ParrillaDePoder poderes;
    public SheHulk() {
        super(ALIAS, IDENTIDAD, Organizacion.A_FORCE);
        //this.poderes = new ParrillaDePoder(3, 7, 3, 5, 1, 4);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(7);
        this.getPoder().setVelocidad(3);
        this.getPoder().setResistencia(5);
        this.getPoder().setEnergia(1);
        this.getPoder().setHabilidad(4);

    }

}

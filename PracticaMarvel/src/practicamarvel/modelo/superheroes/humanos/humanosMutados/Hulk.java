package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Hulk extends HumanoMutado {

    public static final String ALIAS = "Hulk";
    public static final String IDENTIDAD = "Bruce Banner";

    //private ParrillaDePoder poderes;
    public Hulk() {
        super(ALIAS, IDENTIDAD, Organizacion.VENGADORES);
        //this.poderes = new ParrillaDePoder(3, 7, 3, 5, 1, 4);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(7);
        this.getPoder().setVelocidad(3);
        this.getPoder().setResistencia(5);
        this.getPoder().setEnergia(1);
        this.getPoder().setHabilidad(4);

    }

}

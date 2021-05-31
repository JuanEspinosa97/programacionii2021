package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Spiderman extends HumanoMutado {

    public static final String ALIAS = "Spiderman";
    public static final String IDENTIDAD = "Peter Parker";

    //private ParrillaDePoder poderes;
    public Spiderman() {
        super(ALIAS, IDENTIDAD, Organizacion.LIGA_DE_LOS_REINOS);
        // this.poderes = new ParrillaDePoder(4, 4, 3, 3, 1, 4);
        this.getPoder().setInteligencia(4);
        this.getPoder().setFuerza(4);
        this.getPoder().setVelocidad(3);
        this.getPoder().setResistencia(3);
        this.getPoder().setEnergia(1);
        this.getPoder().setHabilidad(4);

    }

}

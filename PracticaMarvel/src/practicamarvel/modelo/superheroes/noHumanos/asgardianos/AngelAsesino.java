package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class AngelAsesino extends Asgardiano {

    public static final String ALIAS = "Angel Asesino";
    public static final String IDENTIDAD = "Aldrif Odinsdottir";

    // private ParrillaDePoder poderes;
    public AngelAsesino() {
        super(ALIAS, IDENTIDAD, Organizacion.LIGA_DE_LOS_REINOS);
        // this.poderes = new ParrillaDePoder(2, 7, 3, 3, 1, 6);
        this.getPoder().setInteligencia(2);
        this.getPoder().setFuerza(7);
        this.getPoder().setVelocidad(3);
        this.getPoder().setResistencia(3);
        this.getPoder().setEnergia(1);
        this.getPoder().setHabilidad(6);

    }

}

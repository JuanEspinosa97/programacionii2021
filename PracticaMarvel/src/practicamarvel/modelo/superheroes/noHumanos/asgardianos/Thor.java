package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Thor extends Asgardiano {

    public static final String ALIAS = "Thor";
    public static final String IDENTIDAD = "Thor Odinson";

    // private ParrillaDePoder poderes;
    public Thor() {
        super(ALIAS, IDENTIDAD, Organizacion.LIGA_DE_LOS_REINOS);
        //this.poderes = new ParrillaDePoder(2, 7, 7, 6, 6, 4);
        this.getPoder().setInteligencia(2);
        this.getPoder().setFuerza(7);
        this.getPoder().setVelocidad(7);
        this.getPoder().setResistencia(6);
        this.getPoder().setEnergia(6);
        this.getPoder().setHabilidad(4);

    }

}

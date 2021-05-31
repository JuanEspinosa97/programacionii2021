package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class IronMan extends HumanoMejorado {

    public static final String ALIAS = "Iron Man";
    public static final String IDENTIDAD = "Anthony Stark";

    //private ParrillaDePoder poderes;
    public IronMan() {
        super(ALIAS, IDENTIDAD, Organizacion.VENGADORES);
        //this.poderes = new ParrillaDePoder(6, 6, 5, 5, 6, 5);
        this.getPoder().setInteligencia(6);
        this.getPoder().setFuerza(6);
        this.getPoder().setVelocidad(5);
        this.getPoder().setResistencia(5);
        this.getPoder().setEnergia(6);
        this.getPoder().setHabilidad(5);

    }

}

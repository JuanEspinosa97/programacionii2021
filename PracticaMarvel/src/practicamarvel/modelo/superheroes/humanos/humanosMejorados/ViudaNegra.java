package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ViudaNegra extends HumanoMejorado {

    public static final String ALIAS = "Viuda Negra";
    public static final String IDENTIDAD = "Natalia Romanov";

    // private ParrillaDePoder poderes;
    public ViudaNegra() {
        super(ALIAS, IDENTIDAD, Organizacion.VENGADORES);
        //this.poderes = new ParrillaDePoder(3, 3, 2, 3, 3, 5);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(3);
        this.getPoder().setVelocidad(2);
        this.getPoder().setResistencia(3);
        this.getPoder().setEnergia(3);
        this.getPoder().setHabilidad(5);

    }

}

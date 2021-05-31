package practicamarvel.modelo.superheroes.humanos.humanosMagicos;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class BrujaEscarlata extends HumanoMagico {

    public static final String ALIAS = "Bruja Escarlata";
    public static final String IDENTIDAD = "Wanda Maximoff";

    //private ParrillaDePoder poderes;
    public BrujaEscarlata() {
        super(ALIAS, IDENTIDAD, Organizacion.ACADEMIA_DOCTOR_STRANGE);
        //this.poderes = new ParrillaDePoder(3, 2, 2, 2, 6, 3);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(2);
        this.getPoder().setVelocidad(2);
        this.getPoder().setEnergia(6);
        this.getPoder().setHabilidad(3);

    }

}

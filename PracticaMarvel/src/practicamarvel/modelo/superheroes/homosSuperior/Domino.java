package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Domino extends HomoSuperior {

    public static final String ALIAS = "Domino";
    public static final String IDENTIDAD = "Neena Thurman";

    //private ParrillaDePoder poderes;
    public Domino() {
        super(ALIAS, IDENTIDAD, Organizacion.MERCENARIOS);
        // this.poderes = new ParrillaDePoder(2, 2, 2, 2, 4, 6);
        this.getPoder().setInteligencia(2);
        this.getPoder().setFuerza(2);
        this.getPoder().setVelocidad(2);
        this.getPoder().setResistencia(2);
        this.getPoder().setEnergia(4);
        this.getPoder().setHabilidad(6);

    }

}

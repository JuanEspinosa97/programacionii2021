package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Tormenta extends HomoSuperior {

    public static final String ALIAS = "Tormenta";
    public static final String IDENTIDAD = "Ororo Munroe";

    //private ParrillaDePoder poderes;
    public Tormenta() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        //this.poderes = new ParrillaDePoder(3, 2, 3, 2, 5, 4);
        this.getPoder().setInteligencia(3);
        this.getPoder().setFuerza(2);
        this.getPoder().setVelocidad(3);
        this.getPoder().setResistencia(2);
        this.getPoder().setEnergia(5);
        this.getPoder().setHabilidad(4);

    }

}

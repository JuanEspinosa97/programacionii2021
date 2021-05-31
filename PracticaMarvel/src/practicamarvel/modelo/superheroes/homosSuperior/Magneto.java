package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Magneto extends HomoSuperior {

    public static final String ALIAS = "Magneto";
    public static final String IDENTIDAD = "Eric Lensher";

    // private ParrillaDePoder poderes;
    public Magneto() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        //this.poderes = new ParrillaDePoder(5, 2, 5, 2, 6, 4);
        this.getPoder().setInteligencia(5);
        this.getPoder().setFuerza(2);
        this.getPoder().setVelocidad(5);
        this.getPoder().setResistencia(2);
        this.getPoder().setEnergia(6);
        this.getPoder().setHabilidad(4);

    }

}

package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Lobezno extends HomoSuperior {

    public static final String ALIAS = "Lobezno";
    public static final String IDENTIDAD = "James Logan Howlett";

    //private ParrillaDePoder poderes;
    public Lobezno() {
        super(ALIAS, IDENTIDAD, Organizacion.X_MEN);
        //this.poderes = new ParrillaDePoder(2, 4, 2, 3, 2, 4);
        this.getPoder().setInteligencia(2);
        this.getPoder().setFuerza(4);
        this.getPoder().setVelocidad(2);
        this.getPoder().setResistencia(3);
        this.getPoder().setEnergia(2);
        this.getPoder().setHabilidad(4);

    }

}

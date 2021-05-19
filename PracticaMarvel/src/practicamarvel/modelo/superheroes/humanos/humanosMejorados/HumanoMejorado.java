package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;
import practicamarvel.modelo.superheroes.humanos.Humano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class HumanoMejorado extends Humano {

    private ParrillaDePoder poder;

    public HumanoMejorado(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.poder.setHabilidad(5);

    }

}

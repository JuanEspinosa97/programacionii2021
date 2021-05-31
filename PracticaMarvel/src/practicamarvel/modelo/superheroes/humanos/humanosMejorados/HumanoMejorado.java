package practicamarvel.modelo.superheroes.humanos.humanosMejorados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.humanos.Humano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class HumanoMejorado extends Humano {

    public HumanoMejorado(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.getPoderes().setHabilidadMax(5);
        this.getPoderes().setHabilidadMin(5);

    }

}

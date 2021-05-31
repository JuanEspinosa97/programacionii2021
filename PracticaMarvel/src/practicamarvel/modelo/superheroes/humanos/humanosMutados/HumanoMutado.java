package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.humanos.Humano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class HumanoMutado extends Humano {

    public HumanoMutado(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.getPoderes().setEnergiaMax(1);
        this.getPoderes().setEnergiaMin(1);
    }

}

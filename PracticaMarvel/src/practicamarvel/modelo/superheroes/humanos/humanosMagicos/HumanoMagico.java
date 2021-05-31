package practicamarvel.modelo.superheroes.humanos.humanosMagicos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.humanos.Humano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class HumanoMagico extends Humano {

    public HumanoMagico(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.getPoderes().setEnergiaMax(6);
        this.getPoderes().setEnergiaMin(6);
    }

}

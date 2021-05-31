package practicamarvel.modelo.superheroes.noHumanos.kress;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.noHumanos.NoHumano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Kress extends NoHumano {

    public Kress(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.getPoderes().setInteligenciaMax(4);
        this.getPoderes().setInteligenciaMin(4);
        this.getPoderes().setFuerzaMax(5);
        this.getPoderes().setFuerzaMin(5);
    }

}

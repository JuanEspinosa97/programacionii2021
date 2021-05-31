package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.noHumanos.NoHumano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Asgardiano extends NoHumano {

    public Asgardiano(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.getPoderes().setInteligenciaMax(2);
        this.getPoderes().setInteligenciaMin(2);
        this.getPoderes().setFuerzaMax(7);
        this.getPoderes().setFuerzaMin(7);
    }

}

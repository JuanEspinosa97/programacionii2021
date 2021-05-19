package practicamarvel.modelo.superheroes.noHumanos.asgardianos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;
import practicamarvel.modelo.superheroes.noHumanos.NoHumano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Asgardiano extends NoHumano {

    private ParrillaDePoder poder;

    public Asgardiano(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.poder.setFuerza(7);
        this.poder.setInteligencia(2);
    }

}

package practicamarvel.modelo.superheroes.noHumanos.kress;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;
import practicamarvel.modelo.superheroes.noHumanos.NoHumano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Kress extends NoHumano {

    private ParrillaDePoder poder;

    public Kress(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.poder.setInteligencia(4);
        this.poder.setFuerza(5);
    }

}

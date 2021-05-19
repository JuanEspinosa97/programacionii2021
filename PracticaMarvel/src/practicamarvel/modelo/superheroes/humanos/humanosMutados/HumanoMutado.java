package practicamarvel.modelo.superheroes.humanos.humanosMutados;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.ParrillaDePoder;
import practicamarvel.modelo.superheroes.humanos.Humano;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class HumanoMutado extends Humano {

    private ParrillaDePoder poder;

    public HumanoMutado(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion);
        this.poder.setEnergia(1);
    }

}

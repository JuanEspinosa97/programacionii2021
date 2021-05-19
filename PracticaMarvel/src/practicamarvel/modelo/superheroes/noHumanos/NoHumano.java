package practicamarvel.modelo.superheroes.noHumanos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.PoderesMinMax;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class NoHumano extends Superheroe {

    public NoHumano(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion, new PoderesMinMax(1, 7, 1, 7, 3, 7, 3, 7, 1, 7, 3, 6));
    }

}

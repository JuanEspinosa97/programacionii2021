package practicamarvel.modelo.superheroes.humanos;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.PoderesMinMax;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class Humano extends Superheroe {

    public Humano(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion, new PoderesMinMax(3, 7, 1, 6, 2, 5, 2, 5, 1, 6, 1, 7));
    }

}

package practicamarvel.modelo.superheroes.homosSuperior;

import practicamarvel.modelo.organizaciones.Organizacion;
import practicamarvel.modelo.superheroes.PoderesMinMax;
import practicamarvel.modelo.superheroes.Superheroe;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public abstract class HomoSuperior extends Superheroe {

    public HomoSuperior(String alias, String identidad, Organizacion organizacion) {
        super(alias, identidad, organizacion, new PoderesMinMax(2, 5, 1, 7, 1, 7, 1, 7, 1, 7, 4, 4));
    }

}

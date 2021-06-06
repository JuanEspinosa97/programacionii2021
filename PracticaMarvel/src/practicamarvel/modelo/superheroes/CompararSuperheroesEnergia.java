package practicamarvel.modelo.superheroes;

import java.util.Comparator;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class CompararSuperheroesEnergia implements Comparator<Superheroe> {

    @Override
    public int compare(Superheroe o1, Superheroe o2) {

        int energia1 = o1.getEnergiaVital();
        int energia2 = o2.getEnergiaVital();

        int diferencia = energia1 - energia2;

        if (diferencia > 0) {

            return 1;

        } else if (diferencia < 0) {

            return -1;

        } else {

            return 0;

        }

    }

}

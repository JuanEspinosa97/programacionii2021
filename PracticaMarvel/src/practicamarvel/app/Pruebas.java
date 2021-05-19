package practicamarvel.app;

import practicamarvel.modelo.escenarios.SanctumSanctorum;
import practicamarvel.modelo.superheroes.homosSuperior.ChicaMarvel;
import practicamarvel.modelo.superheroes.noHumanos.kress.CapitanaMarvel;

/**
 * Aqui ire probando el codigo conforme vaya programando.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Pruebas {

    public static void main(String[] args) {

        //Pruebo a invocar un escenario
        SanctumSanctorum escenario1 = new SanctumSanctorum();
        System.out.println(escenario1);

        /*No puedo invocar un escenario tal cual, debo elegir uno. Para evitarlo,
        lo defino como abstracto.*/
        //Escenario escenario2 = new Escenario();
        //Pruebo a invocar un superheroe
        ChicaMarvel superheroe1 = new ChicaMarvel();
        System.out.println(superheroe1);

        CapitanaMarvel superheroe2 = new CapitanaMarvel();
        System.out.println(superheroe2);

    }

}

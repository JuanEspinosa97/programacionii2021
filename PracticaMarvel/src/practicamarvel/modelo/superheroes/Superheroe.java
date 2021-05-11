package practicamarvel.modelo.superheroes;

import java.util.ArrayList;
import java.util.List;
import practicamarvel.modelo.identificadores.Identificador;
import practicamarvel.modelo.movimientos.Movimiento;
import practicamarvel.modelo.poderes.ParrillaDePoder;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Superheroe extends Identificador {

    private String alias;
    private String identidad;

    private List<Movimiento> movimientos;

    private ParrillaDePoder poderes;

    private double coste;
    private double recompensa;

    public Superheroe(String alias, String identidad) {

        super();
        this.alias = alias;
        this.identidad = identidad;
        this.movimientos = new ArrayList();

    }

}

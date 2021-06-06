package practicamarvel.modelo.identificadores;

/**
 * Numero unico que identifica a cada superheroe dentro del juego. Puede ser
 * auto-incrementado.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Identificador {    //Id del superheroe

    private int id;

    private static int contador = 0;    //si no es static se inicializa a 0. Static todas la instancias las inicializan y se incrementa como una variable global para todas las clases

    public Identificador() {

        this.id = contador++;

    }

    public int getId() {

        return id;

    }

}

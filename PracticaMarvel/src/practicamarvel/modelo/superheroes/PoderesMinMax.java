package practicamarvel.modelo.superheroes;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class PoderesMinMax {

    private int inteligenciaMin;
    private int inteligenciaMax;
    private int fuerzaMin;
    private int fuerzaMax;
    private int velocidadMin;
    private int velocidadMax;
    private int resistenciaMin;
    private int resistenciaMax;
    private int energiaMin;
    private int energiaMax;
    private int habilidadMin;
    private int habilidadMax;

    public PoderesMinMax(int inteligenciaMin, int inteligenciaMax, int fuerzaMin,
            int fuerzaMax, int velocidadMin, int velocidadMax, int resistenciaMin,
            int resistenciaMax, int energiaMin, int energiaMax, int habilidadMin,
            int habilidadMax) {

        this.inteligenciaMin = inteligenciaMin;
        this.inteligenciaMax = inteligenciaMax;
        this.fuerzaMin = fuerzaMin;
        this.fuerzaMax = fuerzaMax;
        this.velocidadMin = velocidadMin;
        this.velocidadMax = velocidadMax;
        this.resistenciaMin = resistenciaMin;
        this.resistenciaMax = resistenciaMax;
        this.energiaMin = energiaMin;
        this.energiaMax = energiaMax;
        this.habilidadMin = habilidadMin;
        this.habilidadMax = habilidadMax;

    }

}

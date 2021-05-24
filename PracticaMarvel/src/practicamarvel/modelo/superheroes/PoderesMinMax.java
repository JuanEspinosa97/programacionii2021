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

    public int getInteligenciaMin() {
        return inteligenciaMin;
    }

    public int getInteligenciaMax() {
        return inteligenciaMax;
    }

    public int getFuerzaMin() {
        return fuerzaMin;
    }

    public int getFuerzaMax() {
        return fuerzaMax;
    }

    public int getVelocidadMin() {
        return velocidadMin;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public int getResistenciaMin() {
        return resistenciaMin;
    }

    public int getResistenciaMax() {
        return resistenciaMax;
    }

    public int getEnergiaMin() {
        return energiaMin;
    }

    public int getEnergiaMax() {
        return energiaMax;
    }

    public int getHabilidadMin() {
        return habilidadMin;
    }

    public int getHabilidadMax() {
        return habilidadMax;
    }

    public void setInteligenciaMin(int inteligenciaMin) {
        this.inteligenciaMin = inteligenciaMin;
    }

    public void setInteligenciaMax(int inteligenciaMax) {
        this.inteligenciaMax = inteligenciaMax;
    }

    public void setFuerzaMin(int fuerzaMin) {
        this.fuerzaMin = fuerzaMin;
    }

    public void setFuerzaMax(int fuerzaMax) {
        this.fuerzaMax = fuerzaMax;
    }

    public void setVelocidadMin(int velocidadMin) {
        this.velocidadMin = velocidadMin;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void setResistenciaMin(int resistenciaMin) {
        this.resistenciaMin = resistenciaMin;
    }

    public void setResistenciaMax(int resistenciaMax) {
        this.resistenciaMax = resistenciaMax;
    }

    public void setEnergiaMin(int energiaMin) {
        this.energiaMin = energiaMin;
    }

    public void setEnergiaMax(int energiaMax) {
        this.energiaMax = energiaMax;
    }

    public void setHabilidadMin(int habilidadMin) {
        this.habilidadMin = habilidadMin;
    }

    public void setHabilidadMax(int habilidadMax) {
        this.habilidadMax = habilidadMax;
    }

}

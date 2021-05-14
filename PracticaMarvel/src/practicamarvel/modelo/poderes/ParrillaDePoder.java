package practicamarvel.modelo.poderes;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class ParrillaDePoder {

    private int inteligencia;
    private int fuerza;
    private int velocidad;
    private int resistencia;
    private int energia;
    private int habilidad;

    public ParrillaDePoder(int inteligencia, int fuerza, int velocidad, int resistencia, int energia, int habilidad) {

        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.energia = energia;
        this.habilidad = habilidad;

    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int sumaPoderes() {

        return this.inteligencia + this.fuerza + this.velocidad + this.resistencia + this.energia + this.habilidad;

    }

    public int mediaPoderes() {

        return this.sumaPoderes() / 6;

    }

}

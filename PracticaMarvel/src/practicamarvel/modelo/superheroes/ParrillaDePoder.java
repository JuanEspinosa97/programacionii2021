package practicamarvel.modelo.superheroes;

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

    public int getResistencia() {
        return resistencia;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int calcularSumaPoderes() {

        return this.inteligencia + this.fuerza + this.velocidad + this.resistencia + this.energia + this.habilidad;

    }

    public int calcularMediaPoderes() {

        return this.calcularSumaPoderes() / 6;

    }

    @Override
    public String toString() {

        return "\n\tInteligencia: " + inteligencia
                + "\n\tFuerza: " + fuerza
                + "\n\tVelocidad: " + velocidad
                + "\n\tResistencia: " + resistencia
                + "\n\tEnergia: " + energia
                + "\n\tHabilidad: " + habilidad;

    }

}

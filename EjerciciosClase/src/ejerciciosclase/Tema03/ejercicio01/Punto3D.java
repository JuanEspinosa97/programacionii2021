package ejerciciosclase.Tema03.ejercicio01;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Punto3D {

    private float x, y, z;  //Definir acceso con private

    public Punto3D() {   //Constructor por defecto.
    }

    public Punto3D(float x, float y, float z) { //Constructor con parametros

        this.x = x;
        this.y = y;
        this.z = z;

    }

    //Decido que el usuario puede acceder a las coordenadas x,y,z y modificar su valor. Añado getters y stters para cada uno de ellos
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override

    public String toString() {

        return "(" + this.x + "," + this.y + "," + this.z + ")";

    }

}

package ejerciciosclase.tema04.ejercicio06;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Contacto {

    private String nombre;
    private String email;
    private int telefono;

    public Contacto() {

        this.nombre = "Juan Espinosa";
        this.email = "j.espinosa9@usp.ceu.es";
        this.telefono = 648947528;

    }

    public Contacto(String nombre, String email, int telefono) {

        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;

    }

    @Override
    public String toString() {

        return "\nContacto: "
                + "\nNombre: " + this.nombre
                + "\nEmail: " + this.email
                + "\nTelefono: " + this.telefono;

    }

}

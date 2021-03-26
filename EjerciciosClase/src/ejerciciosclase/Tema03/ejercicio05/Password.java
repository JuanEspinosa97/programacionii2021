package ejerciciosclase.Tema03.ejercicio05;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Password {

    private static final String COMBINACION = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "1234567890";

    private int longitud;  //habría que comprobar que la contraseña son minimo 8 caracteres
    private String contrasenia;

    public Password() {  //Constructor por defecto

        this.contrasenia = "password";
        this.longitud = 8;

    }

    public Password(int longitud) throws LongitudException {

        comprobarLongitud(longitud);
        this.longitud = longitud;
        this.contrasenia = generarContrasenia(longitud);

    }

    private static String generarContrasenia(int longitud) {

        String c = "";

        for (int i = 0; i < longitud; i++) {

            c += COMBINACION.charAt((int) (Math.random() * COMBINACION.length()));

        }

        return c;

    }

    private void comprobarLongitud(int longitud) throws LongitudException {

        if (longitud < 8) {

            throw new LongitudException();

        }

    }

    /**
     * Devuelve un booleano si es fuerte o no.Para que sea fuerte debe tener más
     * de 2 mayúsculas, más de 1 minúscula y más de 5 números
     *
     * @param contrasenia
     * @return si la contraseña es fuerte o no
     */
    public boolean esFuerte() {

        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contrasenia.length(); i++) {

            if (contrasenia.charAt(i) == MAYUSCULAS.charAt(i)) {

                mayusculas++;

            } else if (contrasenia.charAt(i) == MINUSCULAS.charAt(i)) {

                minusculas++;

            } else if (contrasenia.charAt(i) == NUMEROS.charAt(i)) {

                numeros++;

            }

        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws LongitudException {
        comprobarLongitud(longitud);
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    @Override
    public String toString() {

        return "Contrasenia: " + this.contrasenia;

    }

}

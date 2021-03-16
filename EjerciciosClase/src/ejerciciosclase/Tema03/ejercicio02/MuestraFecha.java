package ejerciciosclase.Tema03.ejercicio02;

/**
 * Crea una clase fecha que almacene el día, el mes y el año de una fecha.
 * Proporciona funciones miembro para acceder a estos atributos (getDia(),
 * getMes() y getAño()) y para modificarlos (setDia(int dia), setMes(int mes) y
 * setAño(int año)). Sobrescribe su método toString(). Crea la fecha 20/10/2018.
 * Muéstrala por pantalla. Después cambia el año 2019. Muéstrala por pantalla.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class MuestraFecha {

    public static void main(String[] args) {

        try {    //Utilizamos try-catch con la intención de capturar la excepción FechaException

            Fecha fecha1 = new Fecha(20, 10, 2018);
            //Fecha fecha1 = new Fecha(-1, 10, 2018); //Da error. Era lo que buscabamos.
            //Fecha fecha1 = new Fecha(20, -1, 2018); //Da error. Era lo que buscabamos.
            //Fecha fecha1 = new Fecha(20, 13, 2018); //Da error. Era lo que buscabamos.
            //Fecha fecha1 = new Fecha(30, 2, 2018); //El mes de febrero solo tiene 28 días si no es bisiesto. Da error. Era lo que buscabamos.
            Fecha fecha2 = new Fecha(29, 2, 2020); //Este si que me deja porque el mes de febrero en año bisiesto tiene 29 dias.
            //Fecha fecha2 = new Fecha(30, 2, 2020); //Sin embargo, al introducir un dia más, da error. Era lo que buscabamos.
            //Fecha fecha2 = new Fecha(20, 2, -1); //Al intentar introducir un año negativo da error.
            //Fecha fecha2 = new Fecha(20, 2, 1); //Determino que el año puede tomar valores desde el 1 hasta el que estime oportuno
            //Fecha fecha2 = new Fecha(20, 2, 80000000);

            System.out.println(fecha1);
            System.out.println(fecha2);

            fecha1.setAnio(2019);
            System.out.println(fecha1);

        } catch (FechaException e) {

            e.printStackTrace();

        }
    }

}

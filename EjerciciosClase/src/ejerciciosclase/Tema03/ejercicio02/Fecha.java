package ejerciciosclase.Tema03.ejercicio02;

import java.util.*;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) throws FechaException {  //Si no añado una Excepcion el usuario podría añadir cualquier Fecha. Me invento una Excepción: FechaException

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        validarFecha(dia, mes, anio);    //Me invento una funcion que tendrá la Excepción y a la que podrán acceder las demás funciones de mi clase

    }

    private void validarFecha(int dia, int mes, int anio) throws FechaException {
        /* Antes de nada, consulto la API de JAVA para informarme acerca de la clase Date y "jugar" con ella:
         * public Date(int year, int month, int day)
         * Deprecated. instead use the constructor Date(long date)
         * Constructs a Date object initialized with the given year, month, and day.
         * The result is undefined if a given argument is out of bounds.
         *
         * Parameters:
         * year - the year minus 1900; must be 0 to 8099. (Note that 8099 is 9999 minus 1900.)
         * month - 0 to 11
         * day - 1 to 31
         *
         */
        Date fechaAValidar = new Date((anio - 1900), (mes - 1), dia);
        /*Para crear nuestra nueva fecha debemos restar al anio 1900 y también tendremos que restar una unidad para que el mes se encuentre entre 1 y 12. Los dias se encuentran entre 1 y 31 como queremos.*/
        if (fechaAValidar.getYear() != (anio - 1900) || (fechaAValidar.getMonth() != (mes - 1))) {

            throw new FechaException(); //Si la fecha no está entre los valores especificados lanzo la excepción. Utilizo los getters de la clase Date para ello.

        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws FechaException {
        validarFecha(dia, this.mes, this.anio); //Evitamos que el usuario cambie el valor por uno erroneo
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws FechaException {
        validarFecha(this.dia, mes, this.anio); //Evitamos que el usuario cambie el valor por uno erroneo
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) throws FechaException {
        validarFecha(this.dia, this.mes, anio); //Evitamos que el usuario cambie el valor por uno erroneo
        this.anio = anio;
    }

    @Override

    public String toString() {

        return this.dia + "/" + this.mes + "/" + this.anio;

    }

}

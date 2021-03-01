package ejerciciosclase.Tema01;

import static ejerciciosclase.Utilidades.Utils.sop;

/**
 * Escribir un programa que defina variables que representen el número de días
 * de un año, el número de horas que tiene un día, el número de minutos que
 * tiene una hora y el número de segundos que tiene un minuto. Emplear las
 * variables que ocupen el mínimo espacio de memoria posible. A continuación,
 * calcular el número de segundos que tiene un año y almacenar el valor del
 * cálculo en otra variable.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio01 {

    public static short infoDiasTieneUnAnio() {

        short dias = 365;
        return dias;

    }

    public static short infoHorasTieneUnDia() {

        short horas = 24;
        return horas;

    }

    public static short infoMinutosTieneUnaHora() {

        short minutos = 60;
        return minutos;

    }

    public static short infoSegundosTieneUnMinuto() {

        short segundos = 60;
        return segundos;

    }

    public static int calculaSegundos(short dias, short horas, short minutos, short segundos) {

        return dias * horas * minutos * segundos;

    }

    public static void main(String[] args) {

        sop("Un anio tiene " + infoDiasTieneUnAnio() + " dias.");
        sop("Un dia tiene " + infoHorasTieneUnDia() + " horas.");
        sop("Una hora tiene " + infoMinutosTieneUnaHora() + " minutos.");
        sop("Un minuto tiene " + infoSegundosTieneUnMinuto() + " segundos.");
        sop("Un anio tiene " + calculaSegundos(infoDiasTieneUnAnio(), infoHorasTieneUnDia(), infoMinutosTieneUnaHora(), infoSegundosTieneUnMinuto()) + " segundos.");

    }

}

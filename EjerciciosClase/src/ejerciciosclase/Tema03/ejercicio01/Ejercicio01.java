package ejerciciosclase.Tema03.ejercicio01;

/**
 * Escribe un programa que cree una clase para representar un objeto punto en
 * tres dimensiones. Proporcionar un constructor que inicialice los valores del
 * punto al origen de coordenadas y otro que permita especificar las coordenadas
 * del punto. Sobrescribe su método toString() para que muestre información
 * sobre los puntos. Usa la clase en un programa donde crees objetos que
 * representen los puntos (12, 13, 18) y (8, 14, 0) y los muestres por consola.
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Punto3D punto1 = new Punto3D(); //llama al constructor por defecto. Inicializa las variables al origen de coordenadas
        Punto3D punto2 = new Punto3D(12.0F, 13.0F, 18.0F); //llama al constructor que pemite especificar las coordenadas
        Punto3D punto3 = new Punto3D(8.0F, 14.0F, 0.0F);

        System.out.println(punto1); //Para representar punto1 accede al metodo toString de la clase Punto3D: punto1.toString()
        System.out.println(punto2);
        System.out.println(punto3);

    }

}

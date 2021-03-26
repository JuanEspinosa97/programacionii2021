package ejerciciosclase.Tema03.ejercicio04;

import static ejerciciosclase.Utilidades.Utils.leerCadena;
import static ejerciciosclase.Utilidades.Utils.leerEntero;
import static ejerciciosclase.Utilidades.Utils.leerReal;
import static ejerciciosclase.Utilidades.Utils.leerSexo;

/**
 *
 * @author Juan Espinosa Rodriguez <j.espinosa9@usp.ceu.es>
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //Pedir por teclado el nombre, la edad, el sexo, el peso y la altura
        System.out.println("Introduzca su nombre: ");
        String nombre = leerCadena();
        System.out.println("Introduzca su edad: ");
        int edad = leerEntero();
        System.out.println("Introduzca su sexo(FEMENINO o MASCULINO): ");
        Sexo sexo = leerSexo();
        System.out.println("Introduzca su peso: ");
        double peso = leerReal();
        System.out.println("Introduzca su altura(en metros): ");
        double altura = leerReal();

        /*
        Crear 3 objetos de la clase Persona. El primer objeto obtendrá las anteriores variables
        pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos peso y altura
        y el último por defecto utilizando métodos set para darle a los atributos un valor.
         */
        Persona[] personas = new Persona[3];

        personas[0] = new Persona(nombre, edad, sexo, peso, altura);
        personas[1] = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(24);
        persona3.setSexo(Sexo.MASCULINO);
        persona3.setPeso(100);
        persona3.setAltura(1.20);
        personas[2] = persona3;

        /*
        Para cada objeto, se deberá comprobar si está en su peso ideal, tiene
        sobrepeso o por debajo de su peso ideal con un mensaje.
         */
        for (int i = 0; i < personas.length; i++) {

            System.out.println("Persona " + (i + 1));

            if (personas[i].valorarPesoCorporal() == Peso.SOBREPESO) {

                System.out.println("Usted tiene sobrepeso.");

            } else if (personas[i].valorarPesoCorporal() == Peso.DESNUTRIDO) {

                System.out.println("Usted tiene desnutricion.");

            } else {

                System.out.println("Usted tiene el peso ideal.");

            }
            //Indicar para cada objeto si es mayor de edad.
            if (personas[i].esMayorDeEdad()) {

                System.out.println("Usted es mayor de edad.");

            } else {

                System.out.println("Usted es menor de edad.");

            }
            //Por último, mostrar la información de cada objeto.
            System.out.println(personas[i]);

        }

        /*  Comprobaciones de DNIs
        try {

            Dni dni1 = new Dni(22);
            Dni dni2 = new Dni(2740912, 'W');

        } catch (DniException de) {

            System.out.println("DNIs correctos.");

        }

        try {
            Dni dni3 = new Dni(2740912, 'C');
        } catch (DniException de) {
            System.out.println("El dni 2740912C es incorrecto.");
        }
         */
    }

}

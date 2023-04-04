/*
Ejercicio 1
    > Crear una clase Persona con atributos nombre, apellido y edad.
    > Crear una lista del tipo String y almacenar 5 nombres.
    > Crear una lista del tipo String y almacenar 5 apellidos.
    > Crear una lista de Personas y agregar 5 personas, donde el
      nombre y apellido corresponde a la posición 1 a 5 de las listas de
      nombre y apellido, y la edad es un número aleatorio entre 20 y 50 años.
    > Reescribir el método toString() de la clase Persona para que muestre los datos formateados
    > Mostrar la lista de personas
    > Iterar sobre la lista de personas y buscar la persona más grande y mostrarla por pantalla.
*/


import Clases.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> miListaNombre = new ArrayList<>();
        miListaNombre.add("N1");
        miListaNombre.add("N2");
        miListaNombre.add("N3");
        miListaNombre.add("N4");
        miListaNombre.add("N5");

        List<String> miListaApellido = new ArrayList<>();
        miListaApellido.add("A1");
        miListaApellido.add("A2");
        miListaApellido.add("A3");
        miListaApellido.add("A4");
        miListaApellido.add("A5");

        List<Persona> miListaPersona = new ArrayList<>();

        Random random = new Random();

        for (int i=0; i<5; i++) {
            int a = random.nextInt(31) + 20;
            miListaPersona.add(new Persona(miListaNombre.get(i), miListaApellido.get(i), a));
        }

        System.out.println(miListaPersona);

        int b = 0;
        Persona grande = null;
        for (Persona persona : miListaPersona) {
            if ( persona.getEdad() > b) {
                b = persona.getEdad();
                grande = persona;
            }
        }

        System.out.println(grande);
    }
}
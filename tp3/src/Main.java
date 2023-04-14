/*
    Ejercicio 1
        > Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados.
        > Sobrescribir el método toString() para ver una representación entendible de un
          objeto de la clase.
        > Crear en la clase de arranque un Set de empleados.
        > Crear 5 objetos empleado, donde 2 empleados tienen los mismos valores de
          atributos, agregarlos al set.
        > Iterar sobre el set y mostrar los objetos empleados.
        > Crear una herencia de la clase Empleado (EmpleadoSet) y modificarla
          para que cuando se agreguen EmpleadoSet a un set, los repetidos sean
          ignorados. Investigar como se hace.
        > Crear 5 objetos empleadoSet, donde 2 empleados tienen los mismos valores
          de atributos, agregarlos al set.
        > Iterar sobre el set y mostrar los objetos empleados. Verificar que el duplicado no existe.
*/
/*
    Ejercicio 2
        > Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
        > Crear una clase generica ListaGenerica que permita mantener una lista de objetos
        que implementan la interfaz comparable.
            1. Definir un método que permita agregar un elemento a la lista.
            2. Definir un método que devuelva la lista de objetos.
            3. Definir un método que devuelva la cantidad de elementos almacenados en la lista.
            4. Definir un método que permita agregar un elemento al principio de la lista.
            5. Definir un método que permita ordenar la lista.
            6. Definir un método que permita desordenar (barajar) la lista.
            7. Definir un método que permita almacenar un elemento en una posición particular de la lista,
               los parámetros que recibe son el objeto a almacenar y la posición en la lista.
            8. Definir un método que devuelva el objeto en una posición específica de la lista
            9. Definir un método que devuelva el objeto en la primer posición de la lista
            10. Definir un método que devuelva el objeto en la ultima posición posición de la lista
            11. Definir un método que remueva un objeto en una posición particular de la lista.
*/
/*
    Ejercicio 3
        > Mejorar al ejercicio anterior agregando las siguientes excepciones:
            1. Una excepción para la función 7 si el indice es mas grande que la cantidad
              de elementos de la lista.
            2. Una excepción para la función 8 si el indice es mayor a la cantidad de elementos en la lista.
            3. Una excepción para la función 9 y 10 si la lista de elementos es vacía.
            4. Una excepción para la función 10 si el elemento en la lista no existe.
*/

import Clases.*;
import Excepciones.ElementoInexistenteExcepcion;
import Excepciones.IndiceMayorExcepcion;
import Excepciones.ListaVaciaExcepcion;
import Excepciones.ParametroNegativoExepcion;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
        ejercicio4y5();
    }

    public static void ejercicio1() {
        Set<Empleado> empleados = new HashSet<>();
        System.out.println("++++++++++++++++++++++++++ Ejercicio 1 ++++++++++++++++++++++++++");
        System.out.println("---------------------- Empleado ----------------------");
        Empleado e1 = (new Empleado("Facundo", "Guarnier", 60157, 4));
        Empleado e2 = (new Empleado("Facundo", "Guarnier", 60157, 4));
        Empleado e3 = (new Empleado("Jorge", "Guarnier", 13396, 25));
        Empleado e4 = (new Empleado("Viviana", "Quattrini", 14471, 21));
        Empleado e5 = (new Empleado("Giovanni", "Quattrini", 43801, 6));

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        System.out.println("---------------------- EmpleadoSet ----------------------");

        Set<Empleado> empleadosset = new HashSet<>();
        EmpleadoSet empleadoSet1 = new EmpleadoSet("Juan", "Pérez", 70010, 5);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("Juan", "Pérez", 70010, 5);
        EmpleadoSet empleadoSet3 = (new EmpleadoSet("Tomas", "Morsucci", 22588, 9));
        EmpleadoSet empleadoSet4 = (new EmpleadoSet("Gustavo", "Sinatra", 00310, 10));
        EmpleadoSet empleadoSet5 = (new EmpleadoSet("Lautaro", "Berardi", 14471, 4));

        empleadosset.add(empleadoSet1);
        empleadosset.add(empleadoSet2);
        empleadosset.add(empleadoSet3);
        empleadosset.add(empleadoSet4);
        empleadosset.add(empleadoSet5);

        for (Empleado empleado : empleadosset) {
            System.out.println(empleado);
        }
    }

    public static void ejercicio2() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 2 ++++++++++++++++++++++++++");
        ListaGenerica<String> listaDeEnteros = new ListaGenerica<>();

        //1*
        listaDeEnteros.agregar("A");
        listaDeEnteros.agregar("B");
        listaDeEnteros.agregar("C");
        listaDeEnteros.agregar("D");

        //2*
        System.out.println(listaDeEnteros.obtener());

        //3*
        System.out.println(listaDeEnteros.tamanio());

        //4*
        listaDeEnteros.agregar_principio("Z");

        //5*
        listaDeEnteros.ordenar();

        //6*
        listaDeEnteros.barajar();

        //7*
        listaDeEnteros.agregar_x_lugar("X", 2);

        //8*
        System.out.println(listaDeEnteros.obtener_x_lugar(2));

        //9*
        System.out.println(listaDeEnteros.obtener_primero());

        //10*
        System.out.println(listaDeEnteros.obtener_ultimo());

        //11*
        listaDeEnteros.remover_x_lugar(2);

    }

    public static void ejercicio3() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 3 ++++++++++++++++++++++++++");
        ListaGenerica<String> listaDeEnteros = new ListaGenerica<>();

        //9* Lista vacia
        try {
            System.out.println(listaDeEnteros.except_obtener_primero());
        } catch (ListaVaciaExcepcion e) {
            System.out.println("Lista vacia.");
            e.printStackTrace();
        }

        //10* Lista vacia
        try {
            System.out.println(listaDeEnteros.except_obtener_ultimo());
        } catch (ListaVaciaExcepcion e) {
            System.out.println("Lista vacia.");
            e.printStackTrace();
        }

        listaDeEnteros.agregar("A");
        listaDeEnteros.agregar("B");
        listaDeEnteros.agregar("C");
        listaDeEnteros.agregar("D");

        //7*
        try {
            listaDeEnteros.except_agregar_x_lugar("X", 10);
        } catch (IndiceMayorExcepcion e) {
            System.out.println("Indice invalido.");
            e.printStackTrace();
        }

        //8*
        try {
            System.out.println(listaDeEnteros.except_obtener_x_lugar(10));
        } catch (IndiceMayorExcepcion e) {
            System.out.println("Indice invalido.");
            e.printStackTrace();
        }

        //11*
        try {
            listaDeEnteros.except_remover_x_lugar(10);
        } catch (ElementoInexistenteExcepcion e) {
            System.out.println("Indice invalido.");
            e.printStackTrace();
        }

    }

    public static void ejercicio4y5() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 4 y 5 ++++++++++++++++++++++++++");

        System.out.println("---------------------- Figuras con valores positivos ----------------------");
        ArrayList<FiguraGeometrica> miLista = new ArrayList<>();

        try {
            miLista.add(new Triangulo(2, 2, 2));
            miLista.add(new Cuadrado(2.6));
            miLista.add(new Circulo(8.1));
            miLista.add(new Triangulo(9.5, 1, 7.9));
            miLista.add(new Cuadrado(1.1));
        }  catch (ParametroNegativoExepcion e) {
            e.printStackTrace();
        }
        System.out.println("Mostrando miLista:");
        for (FiguraGeometrica figuara : miLista) {
            System.out.println(figuara);
        }

        System.out.println("---------------------- Figuras con valores negativos ----------------------");
        ArrayList<FiguraGeometrica> miListaConErrores = new ArrayList<>();

        try {
            miListaConErrores.add(new Triangulo(-2, 2, 2,-8,9));
        }  catch (ParametroNegativoExepcion e) {
            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Cuadrado(2.6,1,-9));
        }  catch (ParametroNegativoExepcion e) {
            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Circulo(-8.1,3,3));
        }  catch (ParametroNegativoExepcion e) {
            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Triangulo(-9.5, 1, 7.9,5,-6));
        }  catch (ParametroNegativoExepcion e) {
            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Cuadrado(-1.1,8,1));
        }  catch (ParametroNegativoExepcion e) {
            e.printStackTrace();
        }

        System.out.println("Mostrando miListaConErrores:");
        for (FiguraGeometrica figuara : miListaConErrores) {
            System.out.println(figuara);
        }
    }

    public static void ejercicio6() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 6 ++++++++++++++++++++++++++");
    }

    public static void ejercicio7() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 7 ++++++++++++++++++++++++++");
    }
}
import Clases.*;
import Excepciones.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4y5();
        ejercicio6();
        ejercicio7();
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
//            e.printStackTrace();
        }

        //10* Lista vacia
        try {
            System.out.println(listaDeEnteros.except_obtener_ultimo());
        } catch (ListaVaciaExcepcion e) {
            System.out.println("Lista vacia.");
//            e.printStackTrace();
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
//            e.printStackTrace();
        }

        //8*
        try {
            System.out.println(listaDeEnteros.except_obtener_x_lugar(10));
        } catch (IndiceMayorExcepcion e) {
            System.out.println("Indice invalido.");
//            e.printStackTrace();
        }

        //11*
        try {
            listaDeEnteros.except_remover_x_lugar(10);
        } catch (ElementoInexistenteExcepcion e) {
            System.out.println("Indice invalido.");
//            e.printStackTrace();
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
            System.out.println("Esto no se deberia ver.");
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
            System.out.println("Parametro negativo.");
//            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Cuadrado(2.6,1,-9));
        }  catch (ParametroNegativoExepcion e) {
            System.out.println("Parametro negativo.");
//            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Circulo(-8.1,3,3));
        }  catch (ParametroNegativoExepcion e) {
            System.out.println("Parametro negativo.");
//            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Triangulo(-9.5, 1, 7.9,5,-6));
        }  catch (ParametroNegativoExepcion e) {
            System.out.println("Parametro negativo.");
//            e.printStackTrace();
        }

        try {
            miListaConErrores.add(new Cuadrado(-1.1,8,1));
        }  catch (ParametroNegativoExepcion e) {
            System.out.println("Parametro negativo.");
//            e.printStackTrace();
        }

        System.out.println("Mostrando miListaConErrores:");
        for (FiguraGeometrica figuara : miListaConErrores) {
            System.out.println(figuara);
        }
    }

    public static void ejercicio6() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 6 ++++++++++++++++++++++++++");
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Facundo", "Guarnier", 60157, 4));
        listaEmpleados.add(new Empleado("Rodrigo", "De Paul", 3333, 3));
        listaEmpleados.add(new Empleado("Lionel", "Messi", 4444, 4));
        listaEmpleados.add(new Empleado("Lionel", "Scaloni", 5555, 5));
        listaEmpleados.add(new Empleado("Sergio", "Agüero", 6666, 6));

        Map<String, Empleado> mapaEmpleados = new HashMap<>();

        for (Empleado empleado : listaEmpleados) {
            mapaEmpleados.put(empleado.getApellido() + "," + empleado.getNombre(), empleado);
        }
        System.out.println(mapaEmpleados);

    }

    public static void ejercicio7() {
        System.out.println("++++++++++++++++++++++++++ Ejercicio 7 ++++++++++++++++++++++++++");

        try {
            System.out.println(Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=001, aniosTrabajados=10"));

            System.out.println(Empleado.fromString("nombre=Pablo,apellido=Marquez,legajo=001,aniosTrabajados=10"));

            System.out.println(Empleado.fromString("nombre=Pablo ,apellido=Marquez ,legajo=001, aniosTrabajados=10"));

            System.out.println(Empleado.fromString("Nombre=Pablo,apellidO=Marquez ,LEGAJO=001, ANIOStrabajados=10"));

            System.out.println(Empleado.fromString("nombre=Pablo,legajo=001,aniosTrabajados=10,apellido=Marquez"));

        } catch (Exception e) {
            System.out.println("Esto no se deberia ver.");
        }

        try {
            System.out.println(Empleado.fromString("legajo=001,aniosTrabajados=10,apellido=Marquez"));

        } catch (CampoNoPresenteExcepcion e) {
            System.out.println("Faltan campos.");
//            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Esto no se deberia ver.");
        }


        try {
            System.out.println(Empleado.fromString("nombre=,legajo=001,aniosTrabajados=10,apellido=Marquez"));

        } catch (ValorVacioExcepcion e) {
            System.out.println("Un atributo no tiene dato.");
//            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Esto no se deberia ver. ValorVacioExcepcion///" + e);
        }

        try {
            System.out.println(Empleado.fromString("nombre=Pablo,legajo=001,aniosTrabajados=10.30,apellido=Marquez"));

        } catch (AniosTrabajadosExcepcion e) {
            System.out.println("Los años no son int.");
//            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Esto no se deberia ver.");
        }

    }
}
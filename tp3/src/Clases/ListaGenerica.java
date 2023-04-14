package Clases;
import Excepciones.ElementoInexistenteExcepcion;
import Excepciones.IndiceMayorExcepcion;
import Excepciones.ListaVaciaExcepcion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lista que solo puede almacenar elementos del mismo tipo, pero cualquier tipo.
public class ListaGenerica <T extends  Comparable<T>> {
    private List<T> lista = new ArrayList<T>();

    // 1*
    public void agregar(T elemento) {
        this.lista.add(elemento);
    }


    // 2*
    public List<T> obtener() {
        return this.lista;
    }


    // 3*
    public int tamanio() {
        return this.lista.size();
    }


    // 4*
    public void agregar_principio(T elemento) {
        this.lista.add(0, elemento);
    }


    // 5*
    public void ordenar() {
        Collections.sort(this.lista);
    }


    // 6*
    public void barajar() {
        Collections.shuffle(this.lista);
    }


    // 7*
    public void agregar_x_lugar(T elemento, int indice) {
        this.lista.add(indice, elemento);
    }


    // 8*
    public T obtener_x_lugar(int indice) {
        return this.lista.get(indice);
    }


    // 9*
    public T obtener_primero() {
        return this.lista.get(0);
    }


    // 10*
    public T obtener_ultimo() {
        return this.lista.get(this.lista.size() - 1);
    }


    // 11*
    public void remover_x_lugar(int indice) {
        this.lista.remove(indice);
    }

    //------------------------- Excepciones -------------------------

    // 7*
    public void except_agregar_x_lugar(T elemento, int indice) throws IndiceMayorExcepcion {
        try {
            this.lista.add(indice, elemento);
        } catch (IndexOutOfBoundsException e) {
            throw new IndiceMayorExcepcion(e);
        }
    }


    // 8*
    public T except_obtener_x_lugar(int indice) throws IndiceMayorExcepcion {
        try {
            return this.lista.get(indice);
        } catch (IndexOutOfBoundsException e) {
            throw new IndiceMayorExcepcion(e);
        }
    }


    // 9*
    public T except_obtener_primero() throws ListaVaciaExcepcion {
        try {
            return this.lista.get(0);
        } catch (IndexOutOfBoundsException e) {
            throw new ListaVaciaExcepcion(e);
        }
    }


    // 10*
    public T except_obtener_ultimo() throws ListaVaciaExcepcion {
        try {
            return this.lista.get(this.lista.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new ListaVaciaExcepcion(e);
        }
    }


    // 11*
    public void except_remover_x_lugar(int indice) throws ElementoInexistenteExcepcion {
        try {
            this.lista.remove(indice);
        } catch (IndexOutOfBoundsException e) {
            throw new ElementoInexistenteExcepcion(e);
        }
    }


}

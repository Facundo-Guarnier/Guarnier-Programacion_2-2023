package Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Lista {
    private Queue<Integer> cola;
    private int capacidad;

    public Lista() {
        cola = new LinkedList<>();
        capacidad = 4;
    }

    public synchronized void agregar(int valor) {
        while (cola.size() == capacidad) {
            try {
                System.out.println("Lista llena...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cola.add(valor);
        System.out.println("Productor agrega " + valor + " en la cola.");
        notifyAll();
    }
    public synchronized int retirar() {
        while (cola.isEmpty()) {
            try {
                System.out.println("Lista vacia...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int valor = cola.remove();
        System.out.println("Consumidor quita " + valor + " de la cola.");
        notifyAll();
        return valor;
    }

    public Integer quedan(){
        return cola.size();
    }

    @Override
    public String toString(){
        return this.cola.toString();
    }

}


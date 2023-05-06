package Ejercicio5;

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


    @Override
    public synchronized String toString(){
        return this.cola.toString();
    }

}
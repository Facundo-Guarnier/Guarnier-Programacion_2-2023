package Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Lista {
    private Queue<Integer> cola;
    private int capacidad;
    private boolean notificado = false;

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
            if (!this.getNotificado()) {
                try {
                    System.out.println("Lista vacia, queda para producir...");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (this.getNotificado()) {
                System.out.println("Lista vacia, NO queda para producir...");
                return -1;
            }
        }
        int valor = cola.remove();
        System.out.println("Consumidor quita " + valor + " de la cola.");
        notifyAll();
        return valor;
    
    }


    //*Getter y setter
    public boolean getNotificado() {
        return notificado;
    }

    public void setNotificado(boolean notificado) {
        this.notificado = notificado;
    }

}


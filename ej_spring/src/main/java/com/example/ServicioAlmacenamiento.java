package com.example;

import java.util.LinkedList;
import java.util.Queue;
import org.springframework.stereotype.Service;

@Service
public class ServicioAlmacenamiento {
    private Queue<Integer> cola;
    private int capacidad;

    public ServicioAlmacenamiento() {
        cola = new LinkedList<>();
        capacidad = 5;
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
        notifyAll();
        return valor;
    }
}

package Ejercicio4;

import java.util.Random;
import java.util.concurrent.Callable;

public class Hilo implements Callable<Void> {
    protected String nombre;
    protected int iteracion;
    protected int demora;

    public Hilo(String nombre) {
        this.nombre = nombre;
        Random random = new Random();
        this.iteracion = random.nextInt(31) + 10;
        this.demora = random.nextInt(950) + 50;
    }

    public Hilo(String nombre, int iteracion, int demora) {
        this.setNombre(nombre);
        this.setIteracion(iteracion);
        this.setDemora(demora);
    }


    @Override
    public Void call() throws Exception {
        for (int i = 0; i<this.iteracion; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteracion " + i);
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        return null;
    }


    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        Random random = new Random();
        if (iteracion >= 10 && iteracion <= 40) {
            this.iteracion = iteracion;
        } else {
            System.out.println("Iteración fuera de rango.");
            this.iteracion = random.nextInt(31) + 10;
        }
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        Random random = new Random();
        if (demora >= 50 && demora <= 999) {
            this.demora = demora;
        } else {
            System.out.println("Demora fuera de rango.");
            this.demora = random.nextInt(950) + 50;
        }

    }


}


package Ejercicio1;

import java.util.Random;

public class Hilo1 extends Thread {
    protected String nombre;
    protected int iteracion;
    protected int demora;

    public Hilo1(String nombre) {
        Random random = new Random();
        this.nombre = nombre;
        this.iteracion = random.nextInt(31) + 10;
        this.demora = random.nextInt(950) + 50;
    }


    @Override
    public void run (){
        for (int i = 0; i<this.iteracion; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteracion " + i);
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


    @Override
    public String toString() {
        return this.nombre + ": demora=" + this.demora + ", iteracion=" + this.iteracion;
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

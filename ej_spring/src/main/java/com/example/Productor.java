package com.example;
import java.util.Random;

import org.springframework.context.ApplicationContext;


public class Productor implements Runnable{
    private ServicioAlmacenamiento almacenamiento;

    public Productor() {
        ApplicationContext context = ApplicationContextProvider.getContext();
        this.almacenamiento = context.getBean(ServicioAlmacenamiento.class);
    }

    public Productor(ServicioAlmacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
        int valor;
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            valor = random.nextInt(10);
            almacenamiento.agregar(valor);
            System.out.println("  Agregando[" + i + "]: " + valor);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}

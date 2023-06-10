package com.example;

import org.springframework.context.ApplicationContext;

public class Consumidor implements Runnable{
    private ServicioAlmacenamiento almacenamiento;

    public Consumidor() {
        ApplicationContext context = ApplicationContextProvider.getContext();
        this.almacenamiento = context.getBean(ServicioAlmacenamiento.class);
    }

    public Consumidor(ServicioAlmacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
        for (int i = 1; i <= 4; i++) {
            int valor = almacenamiento.retirar();
            System.out.println("  Retirado: "+valor);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
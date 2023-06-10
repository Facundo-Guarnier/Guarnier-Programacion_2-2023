package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.*;

public class Arranque {
    
    @Autowired
    ServicioPrueba servicioPrueba;

    @Autowired
    ServicioFecha servicioFecha;

    public void arranque() {
        System.out.println("Arranque");

        //! Servicio 1
        System.out.println("\nInicioando Servicio 1");
        this.servicioPrueba.llamado1();

        //! Servicio 2
        System.out.println("\nInicioando Servicio 2");
        System.out.println("  " + servicioFecha.fechaHoy());
        

        //! Servicio 3
        System.out.println("\nInicioando Servicio 3");
        Productor productor = new Productor();
        Consumidor consumidor = new Consumidor();
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(productor);
        es.submit(consumidor);
        es.shutdown();
    }
}
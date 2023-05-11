package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainE3 {

    public void ejercicio() {

        Lista mi_lista = new Lista();

        Productor p_implements = new Productor(mi_lista);
        Thread p = new Thread(p_implements);
        p.start();

        Consumidor h1_implements = new Consumidor(mi_lista, "hilo1");
        Thread h1 = new Thread(h1_implements);

        Consumidor h2_implements = new Consumidor(mi_lista, "hilo2");
        Thread h2 = new Thread(h2_implements);

        Consumidor h3_implements = new Consumidor(mi_lista, "hilo3");
        Thread h3 = new Thread(h3_implements);

        h1.start();
        h2.start();
        h3.start();
    }
}

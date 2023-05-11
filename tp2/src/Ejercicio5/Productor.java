package Ejercicio5;

import java.util.Random;
import java.util.concurrent.Callable;

public class Productor implements Callable {
    protected final Lista mi_lista; 

    public Productor(Lista mi_lista) {
        this.mi_lista = mi_lista;
    }

    @Override
    public String call() throws Exception {
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            mi_lista.agregar(random.nextInt(12) + 3);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    return null;
    }
    

    //*Setter y getter
    public Lista getMi_lista() {
        return mi_lista;
    }
}

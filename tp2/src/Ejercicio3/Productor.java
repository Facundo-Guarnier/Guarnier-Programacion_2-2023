package Ejercicio3;

import java.util.Random;

public class Productor implements Runnable {
    private final Lista mi_lista;

    public Productor(Lista mi_lista) {
        this.mi_lista = mi_lista;
    }

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            mi_lista.agregar(random.nextInt(12) + 3);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n+++++ Fin productor\n");
        mi_lista.setNotificado(true);
    }

}

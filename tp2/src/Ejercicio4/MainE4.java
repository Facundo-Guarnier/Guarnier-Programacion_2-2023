package Ejercicio4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainE4 {
    public void ejercicio() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Hilo h_callable  = new Hilo("hilo1_callable", 10, 600);
        executorService.submit(h_callable);
        Hilo h_callable2  = new Hilo("hilo2_callable", 20, 300);
        executorService.submit(h_callable2);
        executorService.shutdown();
    }
}

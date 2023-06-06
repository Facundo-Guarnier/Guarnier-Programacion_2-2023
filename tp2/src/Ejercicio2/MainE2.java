package Ejercicio2;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Random;

//import Ejercicio2.HiloFactorial;

public class MainE2 {
    public void ejercicio() {

        // Permite la escritura concurrente entre los 3 hilos.
        List<Integer> numeros = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            numeros.add(random.nextInt(12) + 3);
        }
        System.out.println("Lista de numeros: " + numeros);

        HiloFactorial h1_implements = new HiloFactorial(numeros, "hilo1");
        Thread h1 = new Thread(h1_implements);

        HiloFactorial h2_implements = new HiloFactorial(numeros, "hilo2");
        Thread h2 = new Thread(h2_implements);

        HiloFactorial h3_implements = new HiloFactorial(numeros, "hilo3");
        Thread h3 = new Thread(h3_implements);

        h1.start();
        h2.start();
        h3.start();
    }
}

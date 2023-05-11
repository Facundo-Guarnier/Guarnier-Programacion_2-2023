package Ejercicio3;

import java.util.List;

public class Consumidor implements Runnable {

    protected Lista numeros;
    protected String nombre;

    public Consumidor(Lista numeros, String nombre) {
        this.numeros = numeros;
        this.nombre = nombre;
    }


    public void run() {
        int valor;
        boolean continuar = true;

        while (continuar) {

            valor = this.numeros.retirar();

            if (valor == -1) {
                System.out.println("\n+++++ Finalizando " + this.nombre + "\n");
                continuar = false;
                continue;
            }

            int resultado = 1;
            for (int i = 2; i <= valor; i++) {
                resultado *= i;
            }
            System.out.println(
                "Hilo " + this.nombre + " procesando la lista. " +
                "Valor a calcular: " + valor + ". Resultado: " + resultado
            );

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}


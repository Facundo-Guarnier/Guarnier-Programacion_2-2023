package Ejercicio3;

import java.util.List;

public class HiloFactorial implements Runnable {

    protected Lista numeros;
    protected String nombre;

    public HiloFactorial(Lista numeros, String nombre) {
        this.numeros = numeros;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int valor;
        int quedan;
        while (true) {

            valor = this.numeros.retirar();
            quedan = this.numeros.quedan();

            int resultado = 1;
            for (int i = 2; i <= valor; i++) {
                resultado *= i;
            }
            System.out.println(
                    "Hilo " + this.nombre + " procesando la lista. " +
                            "Valor a calcular: " + valor + ". Resultado: " + resultado +
                            ". Quedan " + quedan + " elementos en la lista por procesar."
            );

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}


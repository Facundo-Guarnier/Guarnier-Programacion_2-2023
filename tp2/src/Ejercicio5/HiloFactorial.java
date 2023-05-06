package Ejercicio5;

import java.util.concurrent.Callable;

public class HiloFactorial implements Callable<String> {

    protected Lista numeros;
    protected String nombre;

    public HiloFactorial(Lista numeros, String nombre) {
        this.numeros = numeros;
        this.nombre = nombre;
    }

    @Override
    public String call() throws Exception  {
        int valor;

        valor = this.numeros.retirar();

        int resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (resultado > 30000000) {
            return (
                    "Hilo " + this.nombre + " procesando la lista. " +
                            "Valor a calcular: " + valor + ". " +
                            "Resultado: " + resultado + ". " +
                            "El resultado es mayor a 30.000.000"
            );
        } else {
            return (
                    "Hilo " + this.nombre + " procesando la lista. " +
                            "Valor a calcular: " + valor + ". " +
                            "Resultado: " + resultado
            );
        }

    }

}


package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Consumidor implements Callable<List<Object>> {

    protected Lista numeros;
    protected String nombre;

    public Consumidor(Lista numeros, String nombre) {
        this.numeros = numeros;
        this.nombre = nombre;
    }

    @Override
    public List<Object> call() throws Exception  {
        int valor;
        List<Object> l_resultado = new ArrayList<>();   //[nombre, valor, resultado]

        l_resultado.add(this.nombre);
        
        valor = this.numeros.retirar();
        l_resultado.add(valor);
        
        int resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        l_resultado.add(resultado);

        return l_resultado;

    }

}


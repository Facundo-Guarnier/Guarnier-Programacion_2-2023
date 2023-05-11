package Ejercicio5;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainE5 {
    public void ejercicio(){
        Lista mi_lista = new Lista();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future> resultados = new ArrayList<>();

        Productor p = new Productor(mi_lista);
        executorService.submit(p);


        for(int i = 0; i < 40; i++) {
            Consumidor c  = new Consumidor(mi_lista, "Consumidor" + i);
            Future<List<Object>> resultado = executorService.submit(c);

            resultados.add(resultado);
        }


        boolean continuar = true;
        while(continuar) {
            if (resultados.size() == 0) {
                continuar = false;
            }
            for (int i = 0; i < resultados.size(); i++) {
                if (resultados.get(i).isDone()) {
                    try {
                        Future<List<Object>> resultado = resultados.get(i);
                        List<Object> r = resultado.get();  

                        if ((int) r.get(2) > 30000000) {
                            System.out.println(
                                "Resultado de ejecución: " +
                                "Hilo " + r.get(0) + " procesando la lista. " +
                                "Valor a calcular: " + r.get(1) + ". " +
                                "Resultado: " + r.get(2) + ". " +
                                "El resultado es mayor a 30.000.000"
                            );
                        } else {
                            System.out.println(
                                "Resultado de ejecución: " +
                                "Hilo " + r.get(0) + " procesando la lista. " +
                                "Valor a calcular: " + r.get(1) + ". " +
                                "Resultado: " + r.get(2) + ". "
                            );
                        }

                        resultados.remove(i);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        executorService.shutdown();
    }
}

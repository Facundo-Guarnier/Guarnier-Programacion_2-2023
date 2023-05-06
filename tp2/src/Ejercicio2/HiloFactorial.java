package Ejercicio2;
import java.util.List;

public class HiloFactorial implements Runnable {

    protected List<Integer> numeros;
    protected String nombre;

    public HiloFactorial(List<Integer> numeros, String nombre) {
        this.numeros = numeros;     // Permite la escritura concurrente entre los 3 hilos.
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int valor;
        int quedan;
        while (true) {

            // Seccion critica
            synchronized (this.numeros) {
                if (this.numeros.isEmpty()) {
                    break;
                }
                valor = this.numeros.remove(0);
                quedan = this.numeros.size();
            }

            int resultado = 1;
            for (int i = 2; i <= valor; i++) {
                resultado *= i;
            }
            System.out.println(
                    "Hilo " + this.nombre + " procesando la lista. " +
                            "Valor a calcular: " + valor + ". Resultado: " + resultado +
                            ". Quedan " + quedan + " elementos en la lista por procesar."
            );
            if (!this.numeros.isEmpty()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }

        }

    }

}

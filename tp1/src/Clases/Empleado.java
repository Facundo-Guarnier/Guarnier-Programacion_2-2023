package Clases;
import Excepciones.AniosTrabajadosExcepcion;
import Excepciones.CampoNoPresenteExcepcion;
import Excepciones.ValorVacioExcepcion;

import java.util.*;

public class Empleado {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Integer aniosTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Integer legajo, Integer aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public static Empleado fromString(String valores) throws ValorVacioExcepcion, CampoNoPresenteExcepcion, AniosTrabajadosExcepcion {
        Map<String, String> mapaValores = new HashMap<>();

        // Separa por coma y espacios juntos. No tiene en cuenta los espacios sin comas.
        String[] listaClaveValor = valores.split("[,\\s]+");

        for (String elemento : listaClaveValor) {
            String[] par = elemento.split("=");         //Separar clave y valor.

            // Ver si el valor está vacio.
            if (par.length != 2) {      // Si el split encuetra un valor vacio "", no lo agrega a par.
                throw new ValorVacioExcepcion("El atributo " + par[0].trim() + " no tiene dato.");
            }

            mapaValores.put(par[0].toLowerCase(), par[1]);
        }

        // Ver si están los 4 campos.
        if (mapaValores.size() != 4) {
            throw new CampoNoPresenteExcepcion("No están todos los campos.");
        }

        int aniosTrabajados = 0;
        try {
             aniosTrabajados = Integer.parseInt(mapaValores.get("aniostrabajados"));
        } catch (Exception e) {
            throw new AniosTrabajadosExcepcion("Años trabajados no es un int.");
        }

        return new Empleado(
                mapaValores.get("nombre"),
                mapaValores.get("apellido"),
                Integer.parseInt(mapaValores.get("legajo")),
                aniosTrabajados
                );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Integer getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(Integer aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "Nombre:'" + this.nombre + '\'' +
                ", Apellido:'" + this.apellido + '\'' +
                ", Legajo:'" + this.legajo + '\'' +
                ", Años trabajados:'" + this.aniosTrabajados +
                '}';
    }
}

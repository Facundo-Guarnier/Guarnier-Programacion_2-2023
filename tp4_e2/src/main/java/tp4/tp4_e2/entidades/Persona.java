package tp4.tp4_e2.entidades;
import lombok.Data;

@Data
public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}
package tp4.tp4_e2.entidades;
import lombok.Data;

@Data
public class Domicilio {

    protected int id;
    protected String calle;
    protected int numero;
    protected String localidad;
    protected String provincia;


    public Domicilio() {
    }

    public Domicilio(String calle, int numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Domicilio [id=" + id + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", provincia=" + provincia + "]";
    }

}
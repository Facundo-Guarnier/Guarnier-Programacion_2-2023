package tp4.tp4_e2.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import tp4.tp4_e2.entidades.Domicilio;
import tp4.tp4_e2.servicios.DomicilioMemoriaServicio;

@Data
@Configuration
@ConfigurationProperties(prefix = "config", ignoreUnknownFields = true)
public class DomicilioConfiguracion {
    
    //TODO: no se porque no anda lo del .yaml.
    protected Domicilio domicilio1;
    protected Domicilio domicilio2;
    protected Domicilio domicilio3;
    
    protected DomicilioMemoriaServicio domicilioMemoriaServicio;
    

    @Autowired
    public DomicilioConfiguracion(DomicilioMemoriaServicio domicilioMemoriaServicio) {
        this.domicilioMemoriaServicio = domicilioMemoriaServicio;
        this.cargarDomicilios();
    }

    private void cargarDomicilios() {
        if (this.domicilio1 == null) {
            System.out.println("No se puede leer los domicilios del yaml.");
            //! No se debería hardcodear los domicilios.
            domicilioMemoriaServicio.post(new Domicilio("Rio Tunuyán", 1891, "Villa Nueva", "Mendoza"));
            domicilioMemoriaServicio.post(new Domicilio("San Martin", 1500, "Mendoza", "Mendoza"));
            domicilioMemoriaServicio.post(new Domicilio("Libertad", 600, "Villa Nueva", "Mendoza"));

        } else {
            domicilioMemoriaServicio.post(this.domicilio1);
            domicilioMemoriaServicio.post(this.domicilio2);
            domicilioMemoriaServicio.post(this.domicilio2);
        }
    }
}
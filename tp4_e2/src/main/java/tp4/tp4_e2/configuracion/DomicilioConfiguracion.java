package tp4.tp4_e2.configuracion;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import tp4.tp4_e2.entidades.Domicilio;
import tp4.tp4_e2.servicios.DomicilioMemoriaServicio;

@Data
@Configuration
@ConfigurationProperties(prefix = "config-domicilios", ignoreUnknownFields = true)
public class DomicilioConfiguracion {
    
    protected  List<Domicilio> domicilios;
    
    protected DomicilioMemoriaServicio domicilioMemoriaServicio;
    
    // @Autowired
    public DomicilioConfiguracion(DomicilioMemoriaServicio domicilioMemoriaServicio) {
        this.domicilioMemoriaServicio = domicilioMemoriaServicio;
    }
    
    @PostConstruct
    private void cargarDomicilios() {
        for (Domicilio d : this.domicilios) {
            domicilioMemoriaServicio.post(d);
            System.out.println(d);
        }

    }

}
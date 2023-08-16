package tp4.tp4_e2.configuracion;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import tp4.tp4_e2.entidades.Persona;
import tp4.tp4_e2.servicios.PersonaMemoriaServicio;

@Data
@Configuration
@ConfigurationProperties(prefix = "config", ignoreUnknownFields = true)
public class PersonaConfiguracion {
    protected String url;
    protected Integer puerto;
    protected List<Persona> personas;

    protected PersonaMemoriaServicio personaMemoriaServicio;

    public PersonaConfiguracion(PersonaMemoriaServicio personaMemoriaServicio) {
        this.personaMemoriaServicio = personaMemoriaServicio;
    }

    @PostConstruct
    private void cargarPersonas() {
        for (Persona p : this.personas) {
            personaMemoriaServicio.post(p);
            System.out.println(p);
        }
    }
}
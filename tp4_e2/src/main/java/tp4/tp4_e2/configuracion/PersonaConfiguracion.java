package tp4.tp4_e2.configuracion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import tp4.tp4_e2.entidades.Persona;
import tp4.tp4_e2.servicios.PersonaMemoriaServicio;

@Data
@Configuration
@ConfigurationProperties(prefix = "config", ignoreUnknownFields = true)
public class PersonaConfiguracion {
    protected String url;
    protected String puerto;
    protected Persona persona1;

    protected PersonaMemoriaServicio personaMemoriaServicio;

    public PersonaConfiguracion(PersonaMemoriaServicio personaMemoriaServicio) {
        this.personaMemoriaServicio = personaMemoriaServicio;
        this.cargarPersonas();
    }

    private void cargarPersonas() {
        if (this.persona1 == null) {
            System.out.println("No se puede leer las Personas del yaml.");
            //! No se debería hardcodear los domicilios.
            personaMemoriaServicio.post(new Persona("Facundo", "Guarnier"));

        } else {
            personaMemoriaServicio.post(this.persona1);
        }
    }
}
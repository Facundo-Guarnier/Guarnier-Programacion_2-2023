package tp4.tp4_e2.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import tp4.tp4_e2.entidades.Persona;

//! Esto es como la conexión a la Base de datos.
@Service
public class PersonaMemoriaServicio implements PersonaRepositorio {
    
    protected Map<Integer, Persona> personas;
    protected int id;

    public PersonaMemoriaServicio() {
        this.personas = new HashMap<>();
        this.id = 0;
    }

    
    @Override
    public Persona get(int id) {
        return this.personas.get(id);       //! Get del Map, no de Domicilios
    }

    
    @Override
    public List<Persona> getAll() {
        return this.personas.values().stream().collect(Collectors.toCollection(ArrayList::new));
    }

    //! Nueva Persona
    @Override
    public void post(Persona persona) {
        persona.setId(id);
        this.id = this.id + 1;
        this.personas.put(persona.getId(), persona);        //! Put del Map
    }

    
    @Override
    public void deleteId(int id) {
        this.personas.remove(id);       //! Remove del Map
    }
    
    
    @Override
    public void deletePersona(Persona persona) {
        this.deleteId(persona.getId());
    }
    
    //! Editar Persona
    @Override
    public void put(int id, Persona persona) {
        persona.setId(id);
        personas.put(id, persona);
    }

}

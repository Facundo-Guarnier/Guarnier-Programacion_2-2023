package tp4.tp4_e2.servicios;

import java.util.List;
import tp4.tp4_e2.entidades.Persona;

//! Interfaz que define el conjunto de metodos que utilizaria la Base de Datos (DomicilioMemoria).
public interface PersonaRepositorio {

    public Persona get(int id);
    public List<Persona> getAll();

    public void post(Persona persona);
    
    public void put(int id, Persona p);

    public void deleteId(int id);
    public void deletePersona(Persona p);
}

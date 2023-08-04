package tp4.tp4_e2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tp4.tp4_e2.entidades.Persona;
import tp4.tp4_e2.servicios.PersonaRepositorio;

//! Esto define los metodos de HTTP y su URL.
@RestController
@RequestMapping("/persona")
public class PersonaControlador {

    @Autowired
    PersonaRepositorio personasRepositorio;

    
    @GetMapping("/{id}")
    public Persona get(@PathVariable int id) {
        return this.personasRepositorio.get(id);
    }

    
    @GetMapping
    public List<Persona> getAll() {
        return this.personasRepositorio.getAll();
    }

    
    @PostMapping
    public Persona post(@RequestBody Persona persona) {
        this.personasRepositorio.post(persona);
        return persona;
    }
    
    
    @DeleteMapping("/{id}")
    public boolean deleteId(@PathVariable int id) {
        if (this.personasRepositorio.get(id) == null) {
            return false;   //! No existe la ID
        }
        this.personasRepositorio.deleteId(id);
        return true;
    }
    
    
    @DeleteMapping
    public boolean deletePersona(@RequestBody Persona persona) {
        System.out.println(persona);
        if (this.personasRepositorio.get(persona.getId()) == null) {
            return false;   //! No existe la ID
        }
        this.personasRepositorio.deletePersona(persona);
        return true;
    }
    
    //*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    @PutMapping("/{id}")
    public boolean put(@PathVariable int id,@RequestBody Persona persona) {
        if (this.personasRepositorio.get(id) == null) {
            return false;   //! No existe la ID
        }
        this.personasRepositorio.put(id, persona);
        return true;
    }
}
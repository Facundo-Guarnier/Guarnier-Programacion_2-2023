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

import tp4.tp4_e2.entidades.Domicilio;
import tp4.tp4_e2.servicios.DomicilioRepositorio;

//! Esto define los metodos de HTTP y su URL.
@RestController
@RequestMapping("/domicilio")   //! URL base
public class DomicilioControlador {

    @Autowired
    DomicilioRepositorio domiciliosRepositorio;

    
    @GetMapping("/{id}")
    public Domicilio get(@PathVariable int id) {
        return this.domiciliosRepositorio.get(id);
    }
    
    
    @GetMapping
    public List<Domicilio> getAll() {
        return this.domiciliosRepositorio.getAll();
    }
    
    
    @PostMapping
    public Domicilio post(@RequestBody Domicilio domicilio) {
        this.domiciliosRepositorio.post(domicilio);
        return domicilio;
    }
    
    
    @DeleteMapping("/{id}")
    public boolean deleteId(@PathVariable int id) {
        if (this.domiciliosRepositorio.get(id) == null) {
            return false;       //! No existe la ID
        }
        this.domiciliosRepositorio.deleteId(id);
        return true;
    }
    
    
    @DeleteMapping
    public boolean deleteDomicilio(@RequestBody Domicilio domicilio) {
        if (this.domiciliosRepositorio.get(domicilio.getId()) == null) {
            return false;       //! No existe la ID
        }
        this.domiciliosRepositorio.deleteDomicilio(domicilio);
        return true;
    }
    
    
    @PutMapping("/{id}")
    public boolean put(@PathVariable int id,@RequestBody Domicilio domicilio) {
        if (this.domiciliosRepositorio.get(id) == null) {
            return false;       //! No existe la ID
        }
        this.domiciliosRepositorio.put(id, domicilio);
        return true;
    }
}
package tp4.tp4_e2.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import tp4.tp4_e2.entidades.Domicilio;

//! Esto es como la conexión a la Base de datos.
@Service
public class DomicilioMemoriaServicio implements DomicilioRepositorio {

    protected Map<Integer, Domicilio> domicilios;
    protected int id;

    public DomicilioMemoriaServicio() {
        this.domicilios = new HashMap<>();
        this.id = 0;
    }

    
    @Override
    public Domicilio get(int id) {
        return this.domicilios.get(id);     //! Get del Map, no de Domicilios
    }
    
    
    @Override
    public List<Domicilio> getAll() {
        return this.domicilios.values().stream().collect(Collectors.toCollection(ArrayList::new));
    }
    
    //! Nuevo Domicilio
    @Override
    public void post(Domicilio domicilio) {
        domicilio.setId(id);
        this.id = this.id + 1;
        this.domicilios.put(domicilio.getId(), domicilio);      //! Put del Map
    }
    
    
    @Override
    public void deleteId(int id) {
        this.domicilios.remove(id);     //! Remove del Map
    }
    
    
    @Override
    public void deleteDomicilio(Domicilio domicilio) {
        this.deleteId(domicilio.getId());
    }
    
    //! Editar Domicilio
    @Override
    public void put(int id, Domicilio domicilio) {
        domicilio.setId(id);
        domicilios.put(id, domicilio);
    }

}

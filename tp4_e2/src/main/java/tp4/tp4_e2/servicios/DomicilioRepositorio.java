package tp4.tp4_e2.servicios;

import java.util.List;
import tp4.tp4_e2.entidades.Domicilio;

//! Interfaz que define el conjunto de metodos que utilizaria la Base de Datos (DomicilioMemoria).
public interface DomicilioRepositorio {

    public Domicilio get(int id);
    public List<Domicilio> getAll();

    public void post(Domicilio domicilio);

    public void put(int id, Domicilio d);
    
    public void deleteId(int id);
    public void deleteDomicilio(Domicilio d);
}

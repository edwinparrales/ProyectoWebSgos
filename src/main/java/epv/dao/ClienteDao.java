package epv.dao;

import epv.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteDao extends JpaRepository<Cliente,Integer> {
    public List<Cliente> findByDniLike(String dni);
    public List<Cliente> findByNombreLikeIgnoreCase(String nombre);

}

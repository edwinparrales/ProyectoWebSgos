package epv.servicio;

import epv.dao.ClienteDao;
import epv.modelo.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteSrv {
    private ClienteDao clienteDao;
    ClienteSrv(ClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    public List<Cliente> listar(){
        return clienteDao.findAll();
    }

    public Cliente guardar(Cliente cliente){
        return clienteDao.save(cliente);
    }
    public List<Cliente> buscarDni(String dni){
        return clienteDao.findByDniLike("%"+dni+"%");
    }

    public void eliminar(Integer id){
        clienteDao.deleteById(id);
    }

}

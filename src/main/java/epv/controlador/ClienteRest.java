package epv.controlador;


import epv.modelo.Cliente;
import epv.servicio.ClienteSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cliente/")
@CrossOrigin(origins = "*")
public class ClienteRest {
    @Autowired
    private ClienteSrv clienteSrv;

    @GetMapping("listar")
    public ResponseEntity<List<Cliente>> listarClientes(){

        return new ResponseEntity<List<Cliente>>(clienteSrv.listar(), HttpStatus.OK);
    }
    @GetMapping("buscar-dni/{dni}")
    public ResponseEntity<List<Cliente>> buscarDni(@PathVariable String dni){
        return new ResponseEntity<>(clienteSrv.buscarDni(dni),HttpStatus.ACCEPTED);
    }
    @PostMapping("guardar")
    public ResponseEntity<Cliente> guardar(@RequestBody Cliente cliente){
       return new ResponseEntity<>(clienteSrv.guardar(cliente),HttpStatus.CREATED);
    }
    @DeleteMapping("eliminar/{id}")

    public ResponseEntity eliminar (@PathVariable Integer id){
        clienteSrv.eliminar(id);
        return ResponseEntity.ok("Producto eliminado");
    }
}

package epv.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("web/inicio/")
public class InicioController {

    @GetMapping("saludo")
    public ResponseEntity<String> saludo(){

        return ResponseEntity.ok("Hola desde Sprig boot");
    }

}

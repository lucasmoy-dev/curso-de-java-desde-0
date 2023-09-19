package academy.atl.gestionclientes.controllers;

import academy.atl.gestionclientes.models.Cliente;
import academy.atl.gestionclientes.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmailController {

    @Autowired
    private IEmailService service;

    @GetMapping("api/email")
    public void sendEmail() {
        String asunto = "Gracias por registrarte!";
        List<String> to = new ArrayList<>();
        to.add("lucasmoy.dev@gmail.com");
        //to.add("info@atl.academy");
        String body = "Hola, Gracias por registrarte...";

        service.enviarEmailDeBienvenida(asunto, to, "Lucas");
    }

}

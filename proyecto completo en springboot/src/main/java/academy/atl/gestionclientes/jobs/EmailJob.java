package academy.atl.gestionclientes.jobs;

import academy.atl.gestionclientes.services.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmailJob {

    @Autowired
    @Qualifier("jetMailService")
    private IEmailService service;

    @Scheduled(cron = "0 0 22 ? * MON")
    public void enviarCampanaPublicitaria() {
        String asunto = "Gracias por registrarte!";
        List<String> to = new ArrayList<>();
        to.add("lucasmoy.dev@gmail.com");
        //to.add("info@atl.academy");
        String body = "Hola, Gracias por registrarte...";

        service.enviarEmailDeBienvenida(asunto, to, "Lucas");
    }
}

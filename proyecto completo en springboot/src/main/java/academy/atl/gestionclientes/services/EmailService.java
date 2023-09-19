package academy.atl.gestionclientes.services;

import java.util.List;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service("emailService")
public class EmailService implements IEmailService{

    @Autowired
    private TemplateEngine templateEngine;

    @Override
    public void sendEmail(String asunto, List<String> to, String body) {
        String usuario = "XXXXXXXXXXX@gmail.com";
        String password = "XXXXXXXXXX";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to.get(0)));
            message.setSubject(asunto);
            message.setText(body);

            Transport.send(message);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void enviarEmailDeBienvenida(String asunto, List<String> to, String nombre) {
        Context context = new Context();
        context.setVariable("nombre", nombre);
        String mensajeHtml = templateEngine.process("email", context);
        sendEmail(asunto, to, mensajeHtml);
    }
}

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ClienteForm formulario = new ClienteForm();
        formulario.setContentPane(formulario.getContenedorPrincipal());
        formulario.setSize(500, 350);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

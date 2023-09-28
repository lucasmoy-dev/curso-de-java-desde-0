import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        CalculadoraImc calculadora = new CalculadoraImc();
        calculadora.setContentPane(calculadora.getMainPanel());
        calculadora.setVisible(true);
        calculadora.setBounds( 300, 300, 480, 150);
        calculadora.setResizable(false);
        calculadora.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

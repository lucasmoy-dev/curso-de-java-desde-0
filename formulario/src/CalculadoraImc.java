import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraImc extends JFrame {
    private JButton btnCalcular;
    private JTextField txtAltura;
    private JTextField txtPeso;
    private JLabel lblImc;
    private JPanel mainPanel;

    public CalculadoraImc() {
        btnCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                calcularImc();
            }
        });
    }

    public void calcularImc() {
        float peso = Float.parseFloat(txtPeso.getText());
        float altura = Float.parseFloat(txtAltura.getText());
        float imc = peso / (altura * altura);

        String estado = getEstado(imc);
        lblImc.setText("" + imc + " - Estado: " + estado);
    }

    private static String getEstado(float imc) {
        String estado;
        if(imc <16.00){
            estado="Infrapeso: Delgadez Severa";
        }else if(imc <=16.00 || imc <=16.99){
            estado="Infrapeso: Delgadez moderada";
        }else if(imc <=17.00 || imc <=18.49){
            estado="Infrapeso: Delgadez aceptable";
        }else if(imc <=18.50 || imc <=24.99){
            estado="Peso Normal";
        }else if(imc <=25.00 || imc <=29.99){
            estado="Sobrepeso";
        }else if(imc <=30.00 || imc <=34.99){
            estado="Obeso: Tipo I";
        }else if(imc <=35.00 || imc == 40.00){
            estado="Obeso: Tipo III";
        }else{
            estado="no existe clasificacion";
        }
        return estado;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JTextField getTxtAltura() {
        return txtAltura;
    }

    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public JLabel getLblImc() {
        return lblImc;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}

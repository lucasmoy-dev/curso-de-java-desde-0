import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ArrayList;

public class ClienteForm extends JFrame {
    private JButton btnGuardar;
    private JList listaClientes;
    private DefaultListModel<String> listaElementos;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JPanel contenedorPrincipal;
    private JTextField txtEmail;
    private JTextField txtTelefono;
    private JTextField txtDireccion;
    private JButton btnEliminar;
    private JButton btnAgregar;

    private List<Cliente> clientes;

    private Cliente cliente;

    public ClienteForm() {
        listaElementos = new DefaultListModel<>();
        listaClientes.setModel(listaElementos);
        clientes = new ArrayList<>();

        btnGuardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);

                crearCliente(false);
                //JOptionPane.showMessageDialog(btnGuardar, "Probando");
            }
        });
        btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                eliminarCliente();
            }
        });
        listaClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                seleccionarCliente();
            }
        });
        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                crearCliente(true);
            }
        });
    }

    private void seleccionarCliente() {
        int indice = listaClientes.getSelectedIndex();
        cliente = clientes.get(indice);
        txtNombre.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtEmail.setText(cliente.getEmail());
        txtTelefono.setText(cliente.getTelefono());
        txtDireccion.setText(cliente.getDireccion());
    }

    private void eliminarCliente() {
        int indice = listaClientes.getSelectedIndex();
        clientes.remove(indice);
        renderizarListaClientes();
    }

    private void crearCliente(boolean esNuevo) {
        if (esNuevo) {
            cliente = new Cliente();
        }
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setDireccion(txtDireccion.getText());

        if (esNuevo) {
            clientes.add(cliente);
        }
        renderizarListaClientes();
    }

    private void renderizarListaClientes() {
        listaElementos.clear();
        for (Cliente cliente : clientes) {
            listaElementos.addElement(cliente.getNombreCompleto());
        }

    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JList getList1() {
        return listaClientes;
    }

    public JTextField getTextField1() {
        return txtNombre;
    }

    public JTextField getTextField2() {
        return txtApellido;
    }

    public JPanel getContenedorPrincipal() {
        return contenedorPrincipal;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

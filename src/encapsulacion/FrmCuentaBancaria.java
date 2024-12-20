package encapsulacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrmCuentaBancaria extends JFrame {

    private JTextField txtNumeroCuenta;
    private JTextField txtTitular;
    private JTextArea txtListaCuentas;
    private JList<String> listCuentas;
    private DefaultListModel<String> listModel;
    private ArrayList<CuentaBancaria> cuentas;

    public FrmCuentaBancaria() {
        // Configuración inicial de la ventana
        setTitle("Registro de Cuentas Bancarias");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Inicializar la lista de cuentas
        cuentas = new ArrayList<>();

        // Panel superior con formulario
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Detalles de la Cuenta"));
        add(panelFormulario, BorderLayout.NORTH);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel lblNumeroCuenta = new JLabel("Número de Cuenta:");
        txtNumeroCuenta = new JTextField(20);
        // Agregar evento para formatear texto
        txtNumeroCuenta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = txtNumeroCuenta.getText();
                if (!Character.isDigit(c) || text.replace("-", "").length() >= 19) {
                    e.consume();
                    return;
                }

                // Formatear número con guiones
                if (text.replace("-", "").length() % 4 == 3 && text.replace("-", "").length() < 18) {
                    txtNumeroCuenta.setText(text + c + "-");
                    e.consume();
                }
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelFormulario.add(lblNumeroCuenta, gbc);
        gbc.gridx = 1;
        panelFormulario.add(txtNumeroCuenta, gbc);

        JLabel lblTitular = new JLabel("Titular de la Cuenta:");
        txtTitular = new JTextField(20);
        // Agregar evento para convertir texto a mayúsculas
        txtTitular.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelFormulario.add(lblTitular, gbc);
        gbc.gridx = 1;
        panelFormulario.add(txtTitular, gbc);

        JButton btnAgregar = new JButton("Agregar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelFormulario.add(btnAgregar, gbc);

        // Panel central con lista y detalles
        JPanel panelCentral = new JPanel(new GridLayout(1, 2, 10, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panelCentral, BorderLayout.CENTER);

        // Lista de cuentas
        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setBorder(BorderFactory.createTitledBorder("Cuentas Registradas"));
        listModel = new DefaultListModel<>();
        listCuentas = new JList<>(listModel);
        JScrollPane scrollLista = new JScrollPane(listCuentas);
        panelLista.add(scrollLista, BorderLayout.CENTER);
        panelCentral.add(panelLista);

        // Detalles de la cuenta seleccionada
        JPanel panelDetalles = new JPanel(new BorderLayout());
        panelDetalles.setBorder(BorderFactory.createTitledBorder("Detalles de la Cuenta"));
        txtListaCuentas = new JTextArea();
        txtListaCuentas.setEditable(false);
        JScrollPane scrollDetalles = new JScrollPane(txtListaCuentas);
        panelDetalles.add(scrollDetalles, BorderLayout.CENTER);
        panelCentral.add(panelDetalles);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        add(panelBotones, BorderLayout.SOUTH);

        JButton btnMostrar = new JButton("Mostrar Detalles");
        panelBotones.add(btnMostrar);

        // Eventos de los botones
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCuenta();
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCuentaSeleccionada();
            }
        });

        // Evento para seleccionar elementos de la lista
        listCuentas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    cargarCuentaSeleccionada();
                }
            }
        });
    }

    private void agregarCuenta() {
        String numeroCuenta = txtNumeroCuenta.getText();
        String titular = txtTitular.getText();

        if (numeroCuenta.isEmpty() || titular.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar si el número de cuenta ya existe
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                JOptionPane.showMessageDialog(this, "El número de cuenta ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, titular);
        cuentas.add(cuenta);

        listModel.addElement(numeroCuenta);
        txtNumeroCuenta.setText("");
        txtTitular.setText("");
        JOptionPane.showMessageDialog(this, "Cuenta agregada correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cargarCuentaSeleccionada() {
        int selectedIndex = listCuentas.getSelectedIndex();
        if (selectedIndex != -1) {
            CuentaBancaria cuenta = cuentas.get(selectedIndex);
            txtNumeroCuenta.setText(cuenta.getNumeroCuenta());
            txtTitular.setText(cuenta.getTitular());
        }
    }

    private void mostrarCuentaSeleccionada() {
        int selectedIndex = listCuentas.getSelectedIndex();
        if (selectedIndex != -1) {
            CuentaBancaria cuenta = cuentas.get(selectedIndex);
            txtListaCuentas.setText(cuenta.imprimir());
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cuenta de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtNumeroCuenta.setText("");
        txtTitular.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FrmCuentaBancaria frame = new FrmCuentaBancaria();
            frame.setVisible(true);
        });
    }
}

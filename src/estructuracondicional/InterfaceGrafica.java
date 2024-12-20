package estructuracondicional;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica {
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Ejemplo de JFrame con Botones");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout nulo para posicionar los componentes manualmente

        // Crear botones
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");

        // Establecer posiciones y tamaños
        boton1.setBounds(50, 50, 120, 30);
        boton2.setBounds(200, 50, 120, 30);
        boton3.setBounds(125, 150, 120, 30);

        // Agregar eventos a los botones
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Has presionado el Botón 1");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Has presionado el Botón 2");
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Has presionado el Botón 3");
            }
        });

        // Agregar botones al JFrame
        frame.add(boton1);
        frame.add(boton2);
        frame.add(boton3);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}

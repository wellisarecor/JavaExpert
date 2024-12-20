package estructurasdedatosestaticos.arreglos;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    /*
    Implementa un programa que permita almacenar 5 nombres en un arreglo y, 
    posteriormente, busque si un nombre específico (ingresado por el usuario) 
    está presente en el arreglo.
     */
    public static void main(String[] args) {

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {

            while (true) {
                String input = JOptionPane.showInputDialog(null, "Ingrese Nombre " + (i + 1) + ":");

                if (input != null && !input.isEmpty()) {
                    nombres[i] = input;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre válido");
                }
            }
        }

        String busqueda = JOptionPane.showInputDialog(null, "Ingrese nombre a buscar:");
        boolean encontrado = false;
        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(busqueda)) { 
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, busqueda + ": Si se encuentra en el arreglo.");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no encontrado en el arreglo.");
        }
    }
}

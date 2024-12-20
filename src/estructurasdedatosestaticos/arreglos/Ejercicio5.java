package estructurasdedatosestaticos.arreglos;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    /*
    Escribe un programa que encuentre el número mayor y el número menor en un arreglo de números enteros dado.
     */
    public static void main(String[] args) {

        int[] arreglo_numeros = new int[2];

        for (int i = 0; i < arreglo_numeros.length; i++) {
            while (true) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Ingrese Número  " + (i + 1) + ":");

                    if (input == null || input.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número valido");
                        continue;
                    }
                    int numero = Integer.parseInt(input);
                    arreglo_numeros[i] = numero;
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido");
                }
            }
        }
        int mayor = (arreglo_numeros[0]>arreglo_numeros[1] ? arreglo_numeros[0]:arreglo_numeros[1]);
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + mayor);

     //USO DE UN OPERADOR TERNARIO //condición ? valor_si_verdadero : valor_si_falso;
    }
}

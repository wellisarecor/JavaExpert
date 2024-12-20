package estructurasdedatosestaticos.arreglos;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    /*
    Escribe un programa que almacene 10 números en un arreglo y calcule la suma y el promedio de todos ellos.
     */
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            while (true) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Ingrese el numero " + (i + 1) + ":");

                    if (input == null || input.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
                        continue;
                    }
                    int numero = Integer.parseInt(input);
                    arreglo[i] = numero;
                    suma += numero;
                    break;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Por favor, ingrese un número válido.");
                }
            }
        }

        double promedio = (double)suma / arreglo.length;
        //Mostrar resultados
        StringBuilder resultado = new StringBuilder("Números Ingresados:\n");
        for (int numero:arreglo){
            resultado.append(numero).append(" ");
        }
        resultado.append("\n\nSuma: ").append(suma).append("\nPromedio: ").append(String.format("%.2f",promedio));
        
        JOptionPane.showMessageDialog(null,resultado.toString());
        
        
    }

}

package estructurasdedatosestaticos.arreglos;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    /*Crea un programa que lea 5 números enteros ingresados por el usuario y
      los almacene en un arreglo. Luego, imprime los números en el 
      orden inverso al que fueron ingresados.
     */
    public static void main(String[] args) {

        int[] arreglo = new int[5];
        for (int i = 0; i < 5; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa número:"));
            arreglo[i] = numero;
        }
       
        
        for (int i =arreglo.length-1; i >= 0; i--) {
           
            System.out.println(arreglo[i] + " ");
        }

    }
}

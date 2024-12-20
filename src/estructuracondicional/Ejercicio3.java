//Ordene de mayor a menor tres numeros enteros
package estructuracondicional;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog(null, "Ingrese Primer numero: ");
        String numero2 = JOptionPane.showInputDialog(null, "Ingrese Segundo numero: ");
        String numero3 = JOptionPane.showInputDialog(null, "Ingrese Tercer numero: ");
        
        //Convirtiendo a enteros
        
        int numero1_entero = Integer.parseInt(numero1);
        int numero2_entero = Integer.parseInt(numero2);
        int numero3_entero = Integer.parseInt(numero3);
        
       int mayor =  numero1_entero;
       
       if (numero2_entero > numero1_entero ){
           mayor = numero2_entero;
       }
       if (numero3_entero > numero1_entero ){
           mayor = numero3_entero;
       }
        JOptionPane.showMessageDialog(null, mayor);

    }
}

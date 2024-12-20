
package estructurasdedatosestaticos.arreglos;

import javax.swing.JOptionPane;

/*
Pide un número n al usuario e imprime una pirámide de asteriscos con esa altura. Ejemplo para n = 5:
markdown
Copiar código
    *
   ***
  *****
 *******
*********
*/
public class Ejercicio6 {
    public static void main(String[] args) {
                
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura de la piramide:"));
        char caracter = JOptionPane.showInputDialog(null,"Ingrese el caracter para formar la piramide:").charAt(0);
      
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n-i;j++){
                System.out.print(" ");
            } 
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(caracter);
            }
            System.out.print("\n");     
        }
}
    
}
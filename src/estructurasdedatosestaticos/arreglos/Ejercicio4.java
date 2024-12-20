
package estructurasdedatosestaticos.arreglos;

import javax.swing.*;

public class Ejercicio4 {
    /*
    Llena un arreglo de tamaño 10 con los números del 1 al 10 y luego muestra los elementos en orden inverso.
    */
     public static void main(String[] args) {
        
         int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
         
         for (int i = arreglo.length -1;i >= 0;i--){
             System.out.println(arreglo[i]+" ");
         }
             
         
    }
}

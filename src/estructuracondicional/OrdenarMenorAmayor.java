package estructuracondicional;

import javax.swing.JOptionPane;

public class OrdenarMenorAmayor {

    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Primer numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Segundo numero: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Tercer numero: "));
        int aux;
        
        if(numero1 >numero2){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        if(numero1>numero3){
            
            aux = numero1;
            numero1 = numero3;
            numero3=aux;
        }
        if(numero2 > numero3){
            aux = numero2;
            numero2=numero3;
            numero3=aux;
        }
        
        JOptionPane.showMessageDialog(null,"Los Número ordenados de menor a mayor son: "+numero1+","+numero2+","+numero3);
    }
}

package estructurasrepetitivas;

import javax.swing.JOptionPane;

public class EstructuraWhile {

    public static void main(String[] args) {

        /* int numero_convertido = 0;
        int suma = 0;

        do {
            suma += numero_convertido;
            String numero = JOptionPane.showInputDialog(null, "Ingrese Número");
            numero_convertido = Integer.parseInt(numero);
        } while (numero_convertido >= 0);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
         */
//        int i = 0;
//        int suma = 0;
//        while (i < 4) {
//            suma = suma + 1;
//            i = i + 2;
//            suma = i - suma;
//
//        }
//        System.out.println("La suma es:"+suma);
        //for(inicializacion, condicion, decremento o incremento)
//        int suma =0;
//        for(int i = 0;i<4;i=i+2){
//           suma  = suma+i;
//           suma = i - suma;
//        }
//        System.out.println("La suma es:"+suma);
//        int num = 5;
//        System.out.println("Table del " + num);
//        for (int i = 0; i < 11; i++) {
//            int resultado = num *i;
//            System.out.println("" + num + " x " + i+" = "+resultado);
//        }
//         int num = 5;
//         int i = 0;
//         while(i<11){
//             int resultado = num *i;
//             System.out.println("" + num + " x " + i+" = "+resultado);
//             i++;
//    int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a sumar"));
//    int suma =0;
//    
//    for(int i=1;i<=numero;i++){
//        suma=suma+i;
//    }
//    System.out.println(suma);
//    
//    
//    
//    
//        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
//        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
//        int sumatotal = sumaDosNumeros(numero1, numero2);
//        JOptionPane.showMessageDialog(null,"La suma es: " + sumatotal);
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        boolean edad_persona = validarEdad(edad);

        if (edad_persona) {
            imprimirMensaje();
            JOptionPane.showMessageDialog(null, "Persona INGRESA su edad es:" + edad + " años");
        } else {
            JOptionPane.showMessageDialog(null,"Persona NO ingresa por ser menor de edad. Tiene: " + edad + " años","ALERTA",JOptionPane.WARNING_MESSAGE);

        }

    }

//    public static int sumaDosNumeros(int numero1, int numero2) {
//
//        int suma = numero1 + numero2;
//        return suma;
//    }
    public static boolean validarEdad(int edad) {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public static void imprimirMensaje() {
        JOptionPane.showMessageDialog(null, "ACCESO PERMITIDO");
    }

}

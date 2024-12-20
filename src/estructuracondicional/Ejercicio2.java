package estructuracondicional;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numeroDias = 2;

        /*        switch (numeroDias) {
            case 1:
                System.out.println("dia lunes");
                break;
            case 2:
                System.out.println("dia martes");
                break;
            case 3:
                System.out.println("dia miercoles");
                break;
            case 4:
                System.out.println("dia jueves");
                break;
            case 5:
                System.out.println("dia viernes");
                break;
            case 6:
                System.out.println("dia sabado");
                break;
            case 7:
                System.out.println("dia domingo");    
                break;
            default:
                System.out.println("No es una opcion valida, ingrese valor del 1 al 7");        
        }
         */
        int numero1 = 5;
        int numero2 = 2;
        int resultado =0;

        char operador = '-';

        switch (operador) {

            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("No es una opcion valida");
        }
        System.out.println("El resultado es: " + resultado);

    }

}

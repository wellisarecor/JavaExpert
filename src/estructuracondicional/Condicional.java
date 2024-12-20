package estructuracondicional;

public class Condicional {

    public static void main(String[] args) {

        int numero_1 = 546;
        int numero_2 = 528;

        if (numero_1 == numero_2) {
            System.out.println("Los números son iguales");
        } 
        else if (numero_1 / numero_2 < 3) {
            System.out.println("El modulo es menor a 3");
        } else {
            System.out.println("Los número son diferentes");
        }

        /*
        Integer numero_5 = 5;
        if(numero_1 == numero_2){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("Los número son diferentes");
        }
        
        Operador terneario (CONDICIÓN ? VALOR_SI_ES_VERDADERO : VALOR_SI_ES_FALSO)
        
        System.out.println(numero_1 == numero_2?"Los números son iguales":"Los número son diferentes");
        
        String valor = (numero_1 == numero_2?"Los números son iguales":"Los número son diferentes");
       
        System.out.println(valor.charAt(2));
         */
    }

}

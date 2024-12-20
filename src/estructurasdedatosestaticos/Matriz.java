//formas de imprimir un arreglo bidimencional| algoritmos de ordenamiento

package estructurasdedatosestaticos;

public class Matriz {

    public static void main(String[] args) {
        int [][] arraybidimencional = new int[2][2];
        
        arraybidimencional[0][0] = 4;
        arraybidimencional[0][1] = 5;
        arraybidimencional[1][0] = 8;
        arraybidimencional[1][1] = 9;
        
           // Imprimir el arreglo bidimensional
        for (int i = 0; i < arraybidimencional.length; i++) { // Iterar por filas
            for (int j = 0; j < arraybidimencional[i].length; j++) { // Iterar por columnas
                System.out.print(arraybidimencional[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
    }
    


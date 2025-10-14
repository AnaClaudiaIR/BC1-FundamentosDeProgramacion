//PROGRAMA QUE IMPRIMA ELEMENTOS DESDE EL FINAL DEL ARRAY
import java.util.Scanner;

public class MostrarInvertidos{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        
        //1. Preguntar al usuario que tan grande quiere el array
         int dimension;
        System.out.println("Dimensión del array: ");
        dimension = scanner.nextInt();
        int[] numeros = new int[dimension];

        //2. Pedir al usuario que valores quiere meter en el array
        for (int i=0; i<dimension;i++){
            System.out.println("Valor: ");
            numeros[i] = scanner.nextInt();
        }

        /* 3. Se crea la variable posición, para que está empiece desde atrás (length) restandole  
         x, que va aumentando con el bucle for.  
        */
        int posicion; 

        for (int x = 0; x<numeros.length; x++){
            posicion = numeros.length - x - 1; //se pone -1 porque la posición va hasta 0, sino da error.

            System.out.print(numeros[posicion] + " ");
        }
    }    
}






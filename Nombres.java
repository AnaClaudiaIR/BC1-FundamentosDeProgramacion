//PROGRAMA QUE IMPRIMA NOMBRES DE UN ARRAY
import java.util.Scanner;

public class Nombres{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         //1. Preguntar al usuario que tan grande quiere el array
         int dimension;
        System.out.println("Dimensión del array (entero): ");
        dimension = scanner.nextInt();

        String[] nombres = new String[dimension];

        scanner.nextLine(); //Limpiar el buffer

        //2. Pedir al usuario que nombres quiere meter en el array
        for (int i=0; i<nombres.length; i++){
            System.out.println("Nombre: ");
            nombres[i] = scanner.nextLine();  
        }

        //3. Imprimir los valores con un bucle for
        for (int i=0; i<nombres.length; i++){
            System.out.print(nombres[i] + ", ");
        }
    }
}




         

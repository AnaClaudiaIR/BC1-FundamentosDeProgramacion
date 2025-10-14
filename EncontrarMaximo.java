//PROGRAMA QUE ENCUENTRE EL NÚMERO MÁS GRANDE DE UN ARRAY
import java.util.Scanner;

public class EncontrarMaximo{
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

        int maximo = numeros[0]; // empezar en la primera posición del array
        int posicion = 1;

        /*3. Que recorra el array y compruebe con el número de al lado si es más grande, 
        si es así meterlo en la variable "maximo".*/

        for (int n = 0; n<numeros.length; n++){
            if(maximo < numeros[n]){
                maximo = numeros[n];
                posicion = n + 1;
            }
        }
        System.out.println("El número más grande es: " + maximo + " y está en la posición: " + posicion);

    }
}









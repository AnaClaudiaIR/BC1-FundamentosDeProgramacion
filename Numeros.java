import java.util.Scanner;

public class Numeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dimension;
        System.out.println("Dimensión del array: ");
        dimension = scanner.nextInt();

        int[] numeros = new int[dimension];
        //Pregunta al usuario que tan grande quiere el array


        //int[] numeros = {1, 2, 3, 4, 5};
        //int[] numeros = new int[5];

        for (int i=0; i<dimension;i++){
            System.out.println("Valor: ");
            numeros[i] = scanner.nextInt();
        }
        // Pregunta que elementos quiere en el array



        /*for (int i=0; i<numeros.length;i++){
            System.out.println("Valor: ");
            numeros[i] = scanner.nextInt();
        }*/


        /*for (int i=0; i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }*/
        scanner.close();
    }
}

//Para ir a la última posición --> numeros.length - 1

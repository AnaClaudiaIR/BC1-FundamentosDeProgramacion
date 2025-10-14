//PROGRAMA QUE SUMA 5 ELEMENTOS DE UNA ARRAY
import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        int[] numeros = new int[5];

        for (int i=0; i<numeros.length;i++){
            System.out.println("Valor: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println(" ");
        System.out.print("La suma de: ");

        for (int i=0; i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
            suma+=numeros[i];
        }

        System.out.println("Es: " + suma);

        scanner.close();
    }
}


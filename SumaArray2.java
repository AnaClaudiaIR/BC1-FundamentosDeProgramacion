
import java.util.Scanner;

public class SumaArray2 {



public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Crear un array de dimensión 10
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //2. Pedir al usuario que números que meter
        for (int j = 0; j<numeros.length; j++){
            System.out.println("Valor (entero): ");
            numeros[j] = scanner.nextInt();
        }

        int resultado = sumaElementosArray(numeros);
        System.out.println("La suma es: " + resultado);

        scanner.close();
    }
 
    public static int sumaElementosArray(int[] num){ //El array inicializado aquí es diferente al de arriba
        int sum = 0; 
        for(int x = 0; x<num.length; x++){
            sum = num[x] + sum;
        }
        return sum;
    }

}
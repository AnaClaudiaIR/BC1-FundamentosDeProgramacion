//PROGRAMA QUE SUMA LOS ELEMENTOS DE UN ARRAY
import java.util.Scanner;

public class SumaArray20 {
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1. Crear un array de dimensión 10
        int[] numeros = new int[10];

        //2. Pedir al usuario que números que meter
        for (int j = 0; j<numeros.length; j++){
            System.out.println("Valor (entero): ");
            numeros[j] = scanner.nextInt();
        }

        //3. Lo que va a hacer en el método
        int resultado = sumaElementosArray(numeros);
        System.out.println("La suma es: " + resultado);

        scanner.close();
    }
    //4. El método
    public static int sumaElementosArray(int[] num){ 
        //El array inicializado aquí es diferente al de arriba
        int sum = 0; 
        for(int x = 0; x<num.length; x++){
            sum = num[x] + sum;
        }
        return sum;
    }
}


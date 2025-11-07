import java.util.Arrays;
import java.util.Scanner;

public class PromedioMediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. QUE EL USUARIO ESCOJA EL TAMAÑO DEL ARRAY
        System.out.println("¿Dimensión del array? ");
        int dimension = scanner.nextInt();
        int[] numeros = new int[dimension];

        //2. QUE NÚMEROS DESEA INTRODUCIR EN EL ARRAY
        for (int i=0; i<dimension;i++){
            System.out.println("Valor: ");
            numeros[i] = scanner.nextInt();
        }

        //3. CALCULAR LA MEDIA
        int suma = 0;
        for (int j=0; j<numeros.length; j++){
            suma += numeros[j];
        }
        int promedio = suma/numeros.length;

        //4. CALCULAR LA MEDIANA --> ORDENAR
        Arrays.sort(numeros);
       int mediana = (int) numeros[numeros.length/2];

       //5. RESULTADOS
       System.out.println("El promedio es: " + promedio);
       System.out.println("La mediana es: " + mediana);
    }
}


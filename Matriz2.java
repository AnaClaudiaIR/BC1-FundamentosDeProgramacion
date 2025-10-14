//PROGRAMA QUE MUESTRA EL MAXIMO, EL MINIMO Y LA SUMA LOS ELEMENTOS DE UN ARRAY

import java.util.Scanner;

public class Matriz2 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        //1. Crear un array de dimensión 5
            int[] numeros = new int[5];

        //2. Pedir al usuario que números que meter
        for (int j = 0; j<numeros.length; j++){
            System.out.println("Valor (entero): ");
            numeros[j] = scanner.nextInt();
        }

        //Imprimir el array
        int i = 0;
        while (i<numeros.length){
            System.out.print(numeros[i] + ", ");
            i++;
        }
        
        System.out.println(" ");//Salto de línea para no juntar "suma" con lo otro

        //3. Lo que va a hacer en el método 1
            int resultado = sumaElementosArray(numeros);
            System.out.println("La suma es: " + resultado);
            
        //4. Lo que hace método 2
            int max = BuscarMaximo(numeros);
            System.out.println("El máximo es: " + max);

        //5. Lo que hace el método 3
            int min = BuscarMinimo(numeros);
            System.out.println("El mínimo es: " + min);
            
            scanner.close();
    }
    
        //Método 1
    public static int sumaElementosArray(int[] num){ //El array inicializado aquí es diferente al de arriba
        int sum = 0; 
     for(int x = 0; x<num.length; x++){
         sum = num[x] + sum;
     }
        return sum;
    }

        //Método 2
    public static int BuscarMaximo(int[] num){
        int maximo = num[0];
        
        for (int n = 0; n<num.length; n++){
            if(maximo < num[n]){
                maximo = num[n];
            }
        }
        return maximo;
    }

        //Método 3
    public static int BuscarMinimo(int[] num){
        int minimo = num[0];
        
        for (int n = 0; n<num.length; n++){
            if(minimo > num[n]){
                minimo = num[n];
            }
        }
        return minimo;
    }

}


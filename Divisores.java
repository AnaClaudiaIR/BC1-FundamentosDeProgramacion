//programa en el que se introduzca un número y luego imprima sus divisores

import java.util.Scanner;

public class Divisores {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        //int divisor = 1; //Declarar divisor como 0 porque luego va a sumar +1 en el bucle
       
        System.out.println("Introduce un número para averiguar sus divisores: ");
        int num = scanner.nextInt();
        int numeroDivisores = 0;

      /*  while (divisor <= num){ //*El divisor empieza desde  0 (1), y se va sumando 1 hasta llegar al mismo valor que el número del usuario (último divisor)
        //*divisor++; --> Si se pone antes del bucle if lo imprime ya habiendo sumado 1. 

            if (num%divisor == 0){ //Si el resto es 0 es que es exacto entonces es un divisor
            System.out.println(divisor); //Imprime el divisor que cumpla la condición anterior
            }
            divisor++;
        }
         */
        System.out.println("Divisores de " + num + ": ");
         for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
                numeroDivisores++;
            }
         }
         System.out.println("Número de divisores: " + numeroDivisores);
    } 
}
    
    
    
        

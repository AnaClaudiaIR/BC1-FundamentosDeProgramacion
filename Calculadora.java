//PROGRAMA CON FUNCIONES BÁSICAS DE LA CALCULADORA
import java.util.Scanner;
    
public class Calculadora {
        public static void main(String[] args){
                Scanner scanner = new Scanner (System.in);

                //Leer dos números enteros
                System.out.println("Introduce el primer número entero: ");
                int num1 = scanner.nextInt();

                System.out.println("Introduce el segundo número entero: ");
                int num2 = scanner.nextInt();

                //Realizar operaciones
                System.out.printf("Suma: %d\n", num1 + num2);
                System.out.printf("Resta: %d\n", num1 - num2);
                System.out.printf("Multiplicación: %d\n", num1 * num2);

                //División con manejo de divisón por 0
                if (num2 != 0){
                        System.out.printf("División: %.2f", (double)num1/num2);
                } else {
                        System.out.println("No se puede dividir entre 0.");
                }
                scanner.close();  
        }
}



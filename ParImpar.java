//programa que diga si un número es par o impar
import java.util.Scanner;
    
public class ParImpar {
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            //pregunta por número
            System.out.print("Introduzca un número entero: ");
            int numero = scanner.nextInt();

            if (numero == 0){ //Preguntar si es 0 al dar error.
                System.out.println("El número introducido es 0.");
            }

            else if (numero%2 == 0){ //dividir entre dos, si el resto es 0 es par.
                System.out.println("El número "+ numero + " es par.");  
            }

            else {
                System.out.println("El número "+ numero + " es impar.");
            }
        }
}


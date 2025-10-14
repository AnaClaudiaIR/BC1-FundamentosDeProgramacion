//programa que pregunte e imprima datos usuario
import java.util.Scanner;
    
public class DatosUsuario {
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            //pregunta por nombre y apellidos
            System.out.print("Nombre y apellidos: ");
            String nombre = scanner.nextLine();
            //Pregunta por edad
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            //Pregunta por altura
            System.out.print("Altura (en metros): ");
            double altura = scanner.nextDouble();
            //Pregunta si estudia actualmente
            System.out.print("¿Estudia actualmente? (true/false): ");
            
            boolean estudia = scanner.nextBoolean();
    

            System.out.printf("\nNombre: %s\n", nombre);
            System.out.printf("Edad: %d años\n", edad);
            System.out.printf("Altura: %.2f metros\n", altura);
            System.out.printf("¿Estudia actualmente?: %b\n", estudia);
        }

    }


    


//Programa que imprime nuestro nombre y edad que pregunta
import java.util.Scanner;
    public class NombreEdad {
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);

            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce tu edad: ");
            int edad = scanner.nextInt();

            System.out.println("Hola, " + nombre.toUpperCase() + ". Tienes " + edad + " años.");
        }
    }

    
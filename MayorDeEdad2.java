//Programama que dice si es mayor o menor de edad
import java.util.Scanner;
import java.time.LocalDate;
    public class MayorDeEdad2 {
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);

            System.out.print("Introduce el año de nacimiento: ");
            int year = scanner.nextInt();

            int yearActual = LocalDate.now().getYear();
            int edad = yearActual - year;

            if (edad >= 18){
                System.out.println("Es mayor de edad.");
            }
            else{
                System.out.println("Es menor de edad.");
            }
        }
    }        
                
    
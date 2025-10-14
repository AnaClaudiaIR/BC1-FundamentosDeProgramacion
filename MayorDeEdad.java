//Programama que dice si es mayor o menor de edad
import java.util.Scanner;
    public class MayorDeEdad {
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);

            System.out.print("Introduce la edad: ");
            int edad = scanner.nextInt();

            boolean esMayorDeEdad;

            if (edad >= 18){
                esMayorDeEdad = true;
            }

                else {
                    esMayorDeEdad = false;
                }
            
                System.out.println(esMayorDeEdad);









            
            


        }
    }
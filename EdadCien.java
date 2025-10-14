import java.time.LocalDate;
import java.util.Scanner;

public class EdadCien {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce el año de nacimiento: ");
                int year = scanner.nextInt();
                int currentYear = LocalDate.now().getYear();

                int edad = currentYear - year;
                System.out.printf("Edad aproximada: %d\n", edad);
                
                if (edad < 100) {
                    System.out.printf("Te faltan %d años para cumplir 100 años. \n",100 - edad);
                }

                else if (edad == 100) {
                    System.out.println("felicidades, este año cumples 100 años.");

                } else {
                    System.out.println("Ya has cumplido más de 100 años.");

                }
                scanner.close();
            }       
}


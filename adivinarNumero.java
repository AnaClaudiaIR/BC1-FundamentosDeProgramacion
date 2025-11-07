import java.util.Scanner;

public class adivinarNumero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAzar = (int) (Math.random()*20+1);//se le suma uno para que cuente el 20
        System.out.println("Adivina el número del 1 al 20: ");
        int numeroConsola = scanner.nextInt();

             do { 
            System.out.println("Adivina el número del 1 al 20: ");
            numeroConsola = scanner.nextInt(); 

            if (numeroConsola < numeroAzar) {
                System.out.println("El número es más grande.");
            } else if (numeroConsola > numeroAzar) {
                System.out.println("El número es más pequeño.");
            } else {
                System.out.println("Lo has adivinado.");
            }

            } while (numeroConsola != numeroAzar); //mientras no coincidan los números se repetirá el bucle de arriba
        }
    }


    
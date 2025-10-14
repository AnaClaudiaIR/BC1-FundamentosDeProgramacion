import java.util.Scanner;

public class Primo{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce un número entero: ");
        int num = scanner.nextInt();
        scanner.close();

        if(num==1){
            System.out.println("El número no es primo.");
        }

        boolean esPrimo = true;
        int raiz = (int) Math.sqrt(num); //solo se necesita la parte entera sin el decimal

        for(int n = 2;n <=raiz; n++){
            if(num % n == 0){
            //que recorra todos los números anteriores a la raíz, y si alguno es divisor no es primo
                esPrimo = false;
                break;
            }
        }
        if (esPrimo){
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
    }
}





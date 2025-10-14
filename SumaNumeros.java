//programa que suma números dados por el usuario, cuando meta uno negativo se detiene el programa.
import java.util.Scanner;

public class SumaNumeros {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        int sumaTotal = 0;
        int numero;

        System.out.println("Introduce un número para sumarlo (uno negativo para parar): ");
        numero = scanner.nextInt();

        /* 1. leer el número 

        **Se puede hacer con culaquier bucle (for, do while, while)

        2. Mientras el número que pida sea mayor que 0 se ejecuta el bucle while --> sigue preguntando */
        while (numero>0){
            sumaTotal = sumaTotal + numero; //Se le suma a la "suma" el número metido --> acumulador 
            System.out.println("Introduce un número para sumarlo (uno negativo para parar): ");
            numero = scanner.nextInt(); 
        }
        System.out.println("La suma total es: " + sumaTotal);
    }
}


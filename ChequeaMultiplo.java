//PROGRAMA ES MULTIPLO CORREGIDO

import java.util.Scanner;

public class ChequeaMultiplo{
    int dividendo;
    int divisor;

    //Método para comprobar 
    public void chequear(int numero, int dividir){
        if (numero%dividir==0){
            System.out.println("Es divisible.");
        } else{
            System.out.println("No es divisible.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ChequeaMultiplo nuevo = new ChequeaMultiplo(); //Crear nuevo objeto que sea un método

        System.out.println("Introduce el dividendo: ");
        nuevo.dividendo = scanner.nextInt();

        System.out.println("Introduce el divisor: ");
        nuevo.divisor = scanner.nextInt();

        nuevo.chequear(nuevo.dividendo, nuevo.divisor); //Llamar al método 

        scanner.close();
    }
}
import java.util.Scanner;

public class factorial{

    public static int fact(int n){
        if (n==0) {
            return 1; //caso base (fórmula --> 0! = 1)
        }
        return n * fact(n-1); //método recursivo --> multiplica por el anterior hasta llegar al caso base
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.println("El resultado de " + numero + "! es: " + fact(numero)); //llamada método al imprimir
    }
}


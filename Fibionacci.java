import java.util.Scanner;

public class Fibionacci{
    public static int fib(int n){
        //PARA EVITAR QUE SEA UN BUCLE INFINITO sE PONE LA "BASE"
        if (n == 0) return 0;
        if (n == 1) return 1;
        //La formula empieza con 1 y 0
        
        return fib(n-1) + fib(n-2);//se llama a sí mismo --> formula secuencia fibionacci  
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduzca un número entero: ");
        int num = scanner.nextInt(); 

        for (int i = 0; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println(" ");
            
        System.out.println("La suma final es: " + fib(num));

        scanner.close();
    }
}
//método recursivo


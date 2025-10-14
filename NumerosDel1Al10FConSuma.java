//programa que imprima los números hasta el número n introducido por el usuario
// mediante bucle for y sume los números
import java.util.Scanner;
    
public class NumerosDel1Al10FConSuma {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Valor de n: ");
            int n = scanner.nextInt();

            int suma = 0;
            double media;

           for (int i = 1; i <= n; i++){
            System.out.println(i);
            //suma = suma + i;
            suma+=i;
           }
           System.out.println("La suma es: " + suma);

           media =(double) suma/n;
           //System.out.println("La media es: " + media);
           System.out.printf("La media es: %.3f", media);
        }
}


import java.util.Scanner;

public class Fibionacci2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        int a = 0;
        int b = 1;
        //Donde comienza la secuencia --> 0 + 1 = 1
        int suma = 0;

        for (int i = 0; i<(numero-1); i++){
            System.out.print(a + " ");
            suma = a + b;
            a = b;
            b = suma;
            //a se convierte en el número siguiente, siendo b, y este se convierte en la suma anterior --> F_n = F_(n-1) + F_(n-2)
        }
        System.out.println(" La secuencia de Fibionacci hasta " + numero + " es " + suma);
    }
}


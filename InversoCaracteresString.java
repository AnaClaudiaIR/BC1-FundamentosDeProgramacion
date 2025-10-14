import java.util.Scanner;

public class InversoCaracteresString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una oración (cadena): ");
        String cadena = scanner.nextLine();

        System.out.println("La cadena: " + cadena);

        for(int i = cadena.length()-1; i>=0; i--){
            System.out.print(cadena.charAt(i) + "");
        }
        System.out.println(" ");
    }
}


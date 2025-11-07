import java.util.Scanner;

public class palindromo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la palabra: ");
        String palabra = scanner.nextLine();

        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length(); i++) { //Comparar ambos extremos 
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1 -i)){ //Si la posición desde atrás coincide hacía adelante, es un palíndromo
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo){
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
        scanner.close();
    }
}









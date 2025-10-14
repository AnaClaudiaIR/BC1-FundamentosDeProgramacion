import java.util.Scanner;

public class vocalMayuscula{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una vocal: ");
        String vocal = scanner.nextLine();

        if (!vocal.equals("a")&&!vocal.equals("e")&&!vocal.equals("i")
            &&!vocal.equals("o")&&!vocal.equals("u")){

            System.out.println("No has introducido una vocal en mínuscula.");
        } else {
            System.out.println("La vocal en mayúscula es: " + vocal.toUpperCase());
        }
        scanner.close();
    }
}


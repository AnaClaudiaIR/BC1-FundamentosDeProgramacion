import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args){
        int contador = 0;
        char espacio = ' '; //Se cuenta una palabra por cada espacio
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la frase/oración (cadena): ");
        String frase = scanner.nextLine();

        for (int x = 0; x<frase.length(); x++){
            if (espacio == frase.charAt(x)){
                contador +=1; //Sumarle al contador 1 cuando se cuente un espacio
            }
        }
        System.out.println("La oración tiene " + (contador+1) + " palabras"); //Contador + 1 por la palabra final

        scanner.close();
    }
}





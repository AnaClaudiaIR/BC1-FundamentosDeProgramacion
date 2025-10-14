import java.util.Scanner;

public class ContarCaracter{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce una palabra u oración (cadena): ");
        String cadena = scanner.nextLine();

        System.out.println("Introduce un carácter: "); //hay que convertirlo a un caracter (char)
        String caracter = scanner.nextLine();

        int total = contarVecesCaracter(cadena, caracter.charAt(0));
        
        //con la funcion "charAt(0)" se convierte en char--> coge el primer caracter de la cadena
        System.out.println("El carácter " + caracter + " aparece " + total + " veces en la cadena " + cadena);

        scanner.close();
    }

    public static int contarVecesCaracter(String cadena, char caracter){ 
        int acumulador = 0;

        for(int i = 0; i<cadena.length(); i++){
            if (caracter == cadena.charAt(i)){
                acumulador++;
            }
        }
        return acumulador;
    }
}



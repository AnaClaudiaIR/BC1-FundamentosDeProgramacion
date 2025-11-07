import java.util.ArrayList;
import java.util.Scanner;

public class ConversorBases{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do { 
            System.out.println("Introduce el número que quieres cambiar: ");
            int numero = scanner.nextInt();

            ArrayList<Integer> conversion = new ArrayList<>(); //Crear una lista sin una dimensión fija --> Donde guardar los restos


            System.out.println("\nEscoja una opción del menú:");
            System.out.println("1. Conversión a binario.");
            System.out.println("2. Conversión a octal.");
            System.out.println("0. Salir del menu.");

            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu){
                case 1:
                    while (numero>0){
                        int resto = numero%2;
                        conversion.add(resto); // Añadir los restos a la lista
                        numero = numero/2; //Añadir este para la última división 
                    }
                    
                    System.out.println("El número en binario es: " );
                    for (int i = conversion.size() -1; i>=0; i--) { //Recorrer la lista en sentido contrario --> "size" es el tamaño
                        System.out.print(conversion.get(i)); //Imprime los números que se hayan guarado en la lista (get)
                    }
                    System.out.println();
                    break;
                
                case 2:
                while (numero>0){
                    int resto = numero%8;
                    conversion.add(resto);
                    numero = numero/8;
                }
                
                System.out.println("El número en octal es: " );
                for (int i = conversion.size() -1; i>=0; i--) {
                    System.out.print(conversion.get(i));
                }
                System.out.println();
                break;
    
                case 0:
                    System.out.println("Has salido del programa.");

                default:
                    System.out.println("No has introducido un número válido.");
            }
        } while (menu != 0);
    }
}


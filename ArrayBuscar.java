import java.util.Scanner;

public class ArrayBuscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        boolean encontrado = false;

        for (int i : numeros) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("==================");
        
        System.out.println("¿Qué número buscas?");
        int numBuscado = scanner.nextInt();

       for (int i : numeros) {
        if(numBuscado == i){
            encontrado = true;
            break;
        } 
       }

       if (encontrado) {
        System.out.println("El número " + numBuscado + " si está.");
       } else {
        System.out.println("EL número no está en la lista.");
       }
    }
}


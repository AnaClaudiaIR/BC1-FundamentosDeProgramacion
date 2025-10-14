import java.util.Scanner;

public class MayorDeTres{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        int x;

        for(x=0; x<numeros.length; x++){
        System.out.println("Introduce el número: ");
        numeros[x] = scanner.nextInt();
        }
        

        int maximo = numeros[0]; // empezar en la primera posición del array
        int posicion = 1;

        for (int n = 0; n<numeros.length; n++){
            if(maximo < numeros[n]){
                maximo = numeros[n];
                posicion = n + 1;
            }
        }
        System.out.println("El número más grande es: " + maximo + " y está en la posición: " + posicion);
    }
}



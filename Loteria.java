import java.util.Arrays;
import java.util.Random;

public class Loteria{
    public static void main(String[] args) {
        int[] numeros = new int[6];

         for (int i=0; i<6;i++){
            numeros[i] = (int) (Math.random()*49);
        }

        System.out.println("Los números generados son: ");
        for(int i = 0; i<6;i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println(" ");

        Arrays.sort(numeros);//funcion que ordena el array
        //Tambien se puede hacer con un for dentro de un método

        System.out.println("Los números ordenados son: ");
        for(int i = 0; i<6; i++){
            System.out.print(numeros[i] + " ");
        }     
    }
}



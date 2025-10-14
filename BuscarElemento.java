import java.util.Scanner;

public class BuscarElemento{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         int k;
         int pos = -1; //No está
        
        //1. Preguntar al usuario que tan grande quiere el array
         int dimension;
        System.out.println("Dimensión del array (entero): ");
        dimension = scanner.nextInt();
        int[] numeros = new int[dimension];

        //2. Pedir al usuario que valores quiere meter en el array
        for (int i=0; i<dimension;i++){
            System.out.println("Valor (entero): ");
            numeros[i] = scanner.nextInt();
        }
        //3. Preguntar que número quiere buscar.
            System.out.println("¿Qué número busca?: ");
            int numBuscado = scanner.nextInt();

        //4. Dentro del for, se recorre el array. 
        for (k = 0; k<numeros.length; k++){
            if (numBuscado == numeros[k]) {
                pos = k + 1; //Le suma 1 para ir al siguiente elemento del array, y lo compara. 
                System.out.println("El número " + numBuscado + " está en la posición " + pos); 
                //Si está el número imprime su posición y el número buscado. 
            }
        }

        if (numBuscado != pos){ //Se va a este bucle si en el anterior no ha encontrado ningún número que coincida.
            System.out.println("El número no se ha encontrado."); 
            //Compara todo el array y si no hay ningún número que coincida sale "error".
        }
}   }



            
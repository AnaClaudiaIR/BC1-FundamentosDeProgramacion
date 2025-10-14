//PROGRAMA QUE IMPRIMA LOS NÚMEROS PARES DE UN ARRAY
public class ContarPares{
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares = 0;

        for (int n=0; n<numeros.length;n++){
            System.out.println(numeros[n] + " "); //--> Imprimir los números de la lista
            if (numeros[n]%2 == 0){
                pares++;
            }
        }
        System.out.println("Hay " + pares + " números pares" );
    }
}






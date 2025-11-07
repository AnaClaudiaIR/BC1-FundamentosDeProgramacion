public class OrdenarArray {
    public static void main(String[] args) {
        int[] numeros = {4,7,2,1,9,10,34};

        System.out.println("Array: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < numeros.length-1; i++) { //Controla las veces que se recorre el bucle
            for (int j = 0; j < numeros.length-1-i; j++) { //Recorre array para comparar los elementos 
                if (numeros[j]>numeros[j + 1]) { //Compara número actual con el siguiente
                    int num = numeros[j];
                    numeros[j] = numeros[j +1 ];
                    numeros[j + 1] = num;
                }
            }   
        }

        System.out.println("================");
        System.out.println("Array ordenado: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}



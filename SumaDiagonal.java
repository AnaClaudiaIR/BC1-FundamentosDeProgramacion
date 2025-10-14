public class SumaDiagonal {
    public static void main(String[] args) {

        //1. Crear el array
        int[][] arrayBi = {{1,2,3}, {4,5,6}, {7,8,9}};

        //2. Imprimir el array
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.print(arrayBi[i][j] + " ");
            }
            System.out.println(" ");
        }

        //3. Que va a hacer el método
        int resultado = sumaElementosArray(arrayBi);
        System.out.println("La suma de los elementos en diagonal es: " + resultado);
    }

        //Método 
    public static int sumaElementosArray(int[][] arrayBi) {
        int suma = 0;

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                if (i == j) {
                    suma = suma + arrayBi[i][j];
                }
            }
        }
        return suma;
    }
}


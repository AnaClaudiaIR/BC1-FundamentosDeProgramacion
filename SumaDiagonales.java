public class SumaDiagonales {
    public static void main(String[] args) {
        int[][] arrayBi = {{1,2,3},{4,5,6},{23,56,1}};

        //IMPRIMIR EL ARRAY
        for (int i= 0; i<arrayBi.length; i++){
            for (int j = 0; j < arrayBi[i].length; j++){
                System.out.print(arrayBi[i][j] + " ");
            }
            System.out.println("");
        }
        int suma = 0;
        for (int i= 0; i<arrayBi.length; i++){
            for (int j = 0; j < arrayBi[i].length; j++){
                if (i == j){
                    suma+= arrayBi[i][j];
                }
            }
        }
         //suma2= arrayBi[0][0] + arrayBi[1][1] + arrayBi[2][2]
        System.out.println("La suma de la diagonal principal es: "+ suma);

        int suma2 = 0;
        for (int i= 0; i<arrayBi.length; i++){
            suma2 += arrayBi[i][arrayBi.length - 1 - i];//las posiciones de i, pero en reversa (-1 al ser la posición)        
        }
        //suma2= arrayBi[0][2] + arrayBi[1][1] + arrayBi[2][0]
        System.out.println("La suma de la diagonal secundaria es: " + suma2);
    }
}


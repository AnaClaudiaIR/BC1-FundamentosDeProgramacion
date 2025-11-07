public class matrizBi{
    public static void main(String[] args) {
        int[][] arrayBi = {{1,0,0},{0,1,0},{0,0,1}};

        for (int i = 0; i < arrayBi.length; i++) { //Recorre las filas
            for (int j = 0; j < arrayBi[i].length; j++) { //Recorre las columnas
                System.out.print(arrayBi[i][j] + " ");            
            }
            System.out.println();//Poner este para que no salgan todos seguidos
            
        }
    }
}


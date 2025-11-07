public class matrizTraspuesta {
    public static void main(String[] args) {
        int[][] arrayBi = {{1,2,3},{4,5,6}};

        System.out.println("Matriz");
        for (int i = 0; i < arrayBi.length; i++) { //Recorre las filas
            for (int j = 0; j < arrayBi[i].length; j++) { //Recorre las columnas
                System.out.print(arrayBi[i][j] + " ");            
            }
            System.out.println();
        }
        System.out.println("=========================");

        //Crear matriz traspuesta --> Para luego intercambiar índices
        int [][] traspuesta = new int[arrayBi[0].length][arrayBi.length];


        System.out.println("Matriz traspuesta");

        for (int i = 0; i < arrayBi.length; i++) { //Recorre las filas
            for (int j = 0; j < arrayBi[i].length; j++) { //Recorre las columnas
                traspuesta[j][i] = arrayBi[i][j]; //Intercmabia los índices --> m*n se convierte en n*m         
            }
        }
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println("");
       }
    }
}


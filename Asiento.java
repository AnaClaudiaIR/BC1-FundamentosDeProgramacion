public class Asiento {
    int fila; 
    int columna;
    boolean ocupado;
    double precio;
    String estado;

    Asiento(int fila, int columna, boolean ocupado, double precio){
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("El asiento: " + this.fila + ", " + this.columna + " está " + this.estado + ". Cuesta: " + this.precio + " euros.");
    }

    public void ocupar(){
        if (ocupado == true){
            estado = "Ocupado";
        } else {
            estado = "Desocupado";
        }
    }

    public static void main(String[] args) {
    
        Asiento[][] asientos = new Asiento[3][4];

        //Asignar asientos aleatorios --> 50% de posibilidades que estén ocupados
        for (int i=0; i<asientos.length; i++){
            for (int j = 0; j < asientos[i].length; j++) {
                boolean ocupado = Math.random() <0.5;
                double precio = 10.00;

                asientos[i][j] = new Asiento(i + 1, j + 1, ocupado, precio);//Crear asiento en el array
                asientos[i][j].ocupar(); //Llamar al método para que lo ponga como ocupado (no salga null)
            }
        }

        System.out.println("===== PLANO SALA ======"); //Imprimir mapa sala
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].ocupado){
                    System.out.print("[ X ]");
                } else {
                    System.out.print("[ O ]");
                }
            }
            System.out.println("");
        }

        System.out.println("\n================="); //Imprimir información
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j].mostrarInfo();
            }
        }
    }
}
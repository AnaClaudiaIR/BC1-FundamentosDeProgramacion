import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
    String nombre;
    double precio;
    int stock;
    boolean oferta;

    //Crear "método" para crear un objeto --> Para cuando se pregunte por consola
    Producto(String nombre, double precio, int stock, boolean oferta){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.oferta = oferta;
    }

    public void mostrarInfo(){
        System.out.println(this.nombre + " tiene un precio de " + this.precio + " euros. Hay " + this.stock + " disponibles. ");
    }

    public void aplicarDescuento(){
        if (oferta == true){
            double precio2 = this.precio * 0.9;
            System.out.println("Este producto tiene un descuento del 10%, vale: " + precio2);
        } else{
            System.out.println("El producto no tiene ningún descuento.");
        } 
    }

    public static void main(String[] args) {
        int mostrar; 
        Scanner scanner = new Scanner(System.in);

        //Crear array de productos (literalmente) --> Son de la misma clase
        Producto[] productos = new Producto[4];

        for (int i=0; i<productos.length; i++){
            System.out.println("Valor (producto): ");
            String nombre = scanner.nextLine();

            System.out.println("Valor (precio): ");
            double precio = scanner.nextDouble();

            System.out.println("Valor (stock): ");
            int stock = scanner.nextInt();

            System.out.println("Valor (oferta) --> true/false: ");
            boolean oferta = scanner.nextBoolean();

            scanner.nextLine(); 

            //Crear objeto producto y meterlo en el array
            productos[i] = new Producto(nombre, precio, stock, oferta);
        }
          do {
            System.out.println("¿Qué producto quieres mostrar? (1 al 4) --> Selecciona 0 para salir: ");
            mostrar = scanner.nextInt();

            productos[mostrar-1].mostrarInfo();
            productos[mostrar-1].aplicarDescuento();  

          } while (mostrar != 0);  

            scanner.close();
    }
}
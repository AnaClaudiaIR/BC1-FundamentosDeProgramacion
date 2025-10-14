//Programa que convierte un double a un int
import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args){
        double d = Math.PI;
        int entero;
        entero = (int) d; //Conversión explícita (cast)
        System.out.printf("El valor %f convertido a int es %d ", d, entero);
    }
}


            
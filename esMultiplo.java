import java.util.Scanner;

public class esMultiplo{
    int dividendo;
    int divisor;

     //Método para comprobar 
     public void chequear(int numero, int dividir){
        if (numero%dividir==0){
            System.out.println(numero + " es divisible entre " + dividir);
        } else{
            System.out.println(numero + " no es divisible entre " + dividir);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        esMultiplo nuevo = new esMultiplo(); //Crear nuevo objeto que sea un método

        System.out.println("Introduce el dividendo: ");
        nuevo.dividendo = scanner.nextInt();

        do{
            nuevo.divisor = (int) (Math.random()*100);
        } while (nuevo.divisor==0); //Que se siga generando un nuveo dividor mientras este sea igual a 0.

        nuevo.chequear(nuevo.dividendo, nuevo.divisor); //Llamar al método 

        scanner.close();
    }
}
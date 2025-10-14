//Programama que calcula area del rectangulo dada una base y altura por el usuario
import java.util.Scanner;
    public class AreaRectangulo {
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);

            System.out.print("Introduce la base: ");
            double base = scanner.nextDouble();

            System.out.print("Introduce la altura: ");
            double altura = scanner.nextDouble();

            double area = base * altura;

            //System.out.println("El área del rectángulo es: " + area);
            System.out.printf("El área del rectángulo con base %.1f y altura %.1f es %.2f", base, altura, area);
            //Se imprime de esta forma para formatear el resultado y que imprima el resultado con uno o dos decimales (redondear)

            scanner.close();
        }
    }

    

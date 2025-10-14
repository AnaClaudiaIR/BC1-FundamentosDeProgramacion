//programa que diga cuantos diás hay en un mes según el número del mes dado por el usuario
import java.util.Scanner;
    
public class DiasMes{
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            //pregunta por número 
            System.out.print("Introduzca un número entero: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1: 
                System.out.println("Enero tiene 31 días.");
                break;

                case 2: 
                System.out.println("Febrero tiene 28 o 29 días.");
                break;

                case 3: 
                System.out.println("Marzo tiene 31 días.");
                break;

                case 4: 
                System.out.println("Abril tiene 30 días.");
                break;

                case 5: 
                System.out.println("Mayo tiene 31 días.");
                break;

                case 6: 
                System.out.println("Junio tiene 30 días.");
                break;

                case 7: 
                System.out.println("Julio tiene 31 días.");
                break;

                case 8: 
                System.out.println("Agosto tiene 31 días.");
                break;

                case 9: 
                System.out.println("Septiembre tiene 30 días.");
                break;

                case 10: 
                System.out.println("Octubre tiene 31 días.");
                break;

                case 11: 
                System.out.println("Noviembre tiene 30 días.");
                break;

                case 12: 
                System.out.println("Diciembre tiene 31 días.");
                break;

                default:
                System.out.println("Número no válido");

            }
        }
}



/* 
HACERLO CON BUCLE IF
if ((mes ==1)||(mes == 3)...){
    dias = 31
} 
... --> Lo mismo para el resto de meses    
*/
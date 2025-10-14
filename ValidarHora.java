import java.util.Scanner;

public class ValidarHora{
    public static void main(String[] args){
        int hora;
        int min;
        int seg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la hora (0-23): ");
        hora = scanner.nextInt();

        System.out.println("Introduce los minutos (0-59): ");
        min = scanner.nextInt();

        System.out.println("Introduce loa segundos (0-59): ");
        seg = scanner.nextInt();  
        
        esHoraValida (hora, min, seg); 
        //llamar al método para las tres variables

    }

    public static void esHoraValida(int hora, int min, int seg){ 
        //método para evaluar las tres variables

        if (seg < 0 || seg > 59){
            System.out.println("Segundos no válidos.");
            return; //return va dentro del bucle
        }
        
        if (min < 0 || min > 59){
            System.out.println("Minutos no válidos.");
            return;
        }
        
        if (hora < 0 || hora > 23){
            System.out.println("Hora no válida.");
            return;
        }
        System.out.println("La hora introducida es válida: " + hora + ":" + min + ":" + seg);
    }
}


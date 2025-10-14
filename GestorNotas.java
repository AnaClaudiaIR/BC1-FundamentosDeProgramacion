import java.util.Scanner;

public class GestorNotas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
    //1. DECLARACIÓN Y DIMENSIÓN DEL ARRAY
    String[] alumnos = new String[10];
    int[] notas = new int[10];

    scanner.nextLine();

    //2. METER LOS ALUMNOS Y NOTAS EN EL ARRAY
    for (int i=0; i<alumnos.length; i++){
        System.out.println("Introduce el nombre del alumno: ");
        alumnos[i] = scanner.nextLine();  
    }

    for (int i=0; i<notas.length; i++){
        System.out.println("Introduce la nota del alumno" + alumnos[i] + ": ");
        notas[i] = scanner.nextInt();  
        scanner.nextLine();
    }

    System.out.println(" ");

    System.out.println("Listado de alumnos y sus notas:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i] + " - Nota: " + notas[i]);
        }

    //3. 
    }
}
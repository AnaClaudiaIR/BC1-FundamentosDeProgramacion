import java.util.Scanner;

public class GestorNotas2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        String[] alumnos = new String[10];
        int[] notas = new int[10];
        int numAlumnos = 0;
        int menu;

    do {
            System.out.println("\nEscoja una opción del menú:");
            System.out.println("1. Ingresar estudiantes e ingresar su nota");
            System.out.println("2. Media de calificaciones y nota global");
            System.out.println("3. Nota más alta y más baja");
            System.out.println("4. Número de suspensos y aprobados");
            System.out.println("5. Buscar estudiantes para mostrar su nota");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
           
            menu = scanner.nextInt();
            scanner.nextLine();
    
    switch (menu) {
        case 1:
            if (numAlumnos >= 10){
                System.out.println("Ya se ha alcanzado el máximo de alumnos permitidos.");
                break;
            }

            for (int i = numAlumnos; i < alumnos.length; i++) {

                System.out.println("Introduce el nombre del alumno: ");
                alumnos[i] = scanner.nextLine();

                System.out.println("Introduce la nota del alumno " + alumnos[i] + ": ");
                notas[i] = scanner.nextInt();
                scanner.nextLine();
                numAlumnos++;

                if (numAlumnos >= 10) {
                    System.out.println("No se pueden introducir más alumnos.");
                    break;
                }
            }
            break;
        
        case 2:
            if (numAlumnos == 0){
                System.out.println("No se ha introducido ningún alumno.");
                break;
            }
            int sum = 0;
            for( int i = 0; i < numAlumnos; i++){
                sum = notas[i] + sum;
            }
        double media = (double) sum/(notas.length);
        System.out.printf("La media %.2f de todas las calificaciones es: ", media);

        if (media >= 5){
            System.out.println("La calificación global es: APROBADO.");
        } else {
            System.out.println("La calificación global es: SUSPENSO.");
        }
        break;

        case 3:
             if (numAlumnos == 0){
                System.out.println("No se ha introducido ningún alumno.");
                break;
            }

            int max = BuscarMaximo(notas, numAlumnos);
            System.out.println("El máximo es: " + max);
        
            int min = BuscarMinimo(notas, numAlumnos);
            System.out.println("El mínimo es: " + min);
            break; 

        case 4:
             if (numAlumnos == 0){
                System.out.println("No se ha introducido ningún alumno.");
                break;
            }

            int aprobados = 0;
            for (int n = 0; n<notas.length; n++){
                if (notas[n] >= 5){
                    aprobados++;
                }
            }
            System.out.println("El número de aprobados es: " + aprobados);
            System.out.println("El número de suspensos es:" + (numAlumnos - aprobados));
            break;

        case 5:
             if (numAlumnos == 0){
                System.out.println("No se ha introducido ningún alumno.");
                break;
            }
            
            int pos;
            System.out.println("¿Qué nombre buscas?: ");
            String nomBuscado = scanner.nextLine();

            boolean encontrado = false;
 
            for (int k = 0; k<numAlumnos; k++){
                if (nomBuscado.equals(alumnos[k])) {
                    //hay que comparar strings por eso hay que usar esa función, con la de posicion es solo para números

                    System.out.println("El alumno " + nomBuscado + " tiene una calificación de: " + notas[k]); 
                    encontrado = true;

                break;
            }
        }
            if (!encontrado){ //Se usa el booleano porque son strings, no se está buscando un número
                System.out.println("El nombre no se ha encontrado.");      
            }
            break;

        case 0:
            System.out.println("Has salido.");
            break;

        default:
            System.out.println("Número no válido. Inténtelo de nuevo.");
                break;
        }

    }   while (menu != 0); //hay que ponerlo asi si no hace nada

    scanner.close();
}

     public static int BuscarMaximo(int[] notas, int numAlumnos){
        int maximo = notas[0];
        
        for (int n = 1; n<numAlumnos; n++){
            if(maximo < notas[n]){
                maximo = notas[n];
            }
        }
        return maximo;
    }

    public static int BuscarMinimo(int[] notas, int numAlumnos){
        int minimo = notas[0];
        
        for (int n = 1; n<numAlumnos; n++){
            if(minimo > notas[n]){
                minimo = notas[n];
            }
        }
        return minimo;
    }
}
//Se recorre los arrays con numAlumnos, con notas.length recorre todo el array aunque hayan huecos vacíos.





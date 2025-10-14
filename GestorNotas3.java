//CORREGIDO HECHO CON CHATI MY BELOVED

import java.util.Scanner;

public class GestorNotas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alumnos = new String[10];
        int[] notas = new int[10];
        int numAlumnos = 0; // cantidad real de alumnos registrados
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
                    if (numAlumnos >= 10) {
                        System.out.println("Ya se ha alcanzado el máximo de 10 alumnos.");
                        break;
                    }

                    String continuar;
                    do {
                        if (numAlumnos >= 10) {
                            System.out.println("Ya se ha alcanzado el máximo de 10 alumnos.");
                            break;
                        }

                        System.out.print("Introduce el nombre del alumno: ");
                        alumnos[numAlumnos] = scanner.nextLine();

                        System.out.print("Introduce la nota de " + alumnos[numAlumnos] + ": ");
                        notas[numAlumnos] = scanner.nextInt();
                        scanner.nextLine();

                        numAlumnos++;

                        if (numAlumnos < 10) {
                            System.out.print("¿Desea ingresar otro alumno? (s/n): ");
                            continuar = scanner.nextLine();
                        } else {
                            System.out.println("Se ha alcanzado el límite de 10 alumnos.");
                            continuar = "n";
                        }
                    } while (continuar.equalsIgnoreCase("s"));
                    break;

                case 2:
                    if (numAlumnos == 0) {
                        System.out.println("No hay estudiantes registrados.");
                        break;
                    }

                    int sum = 0;
                    for (int i = 0; i < numAlumnos; i++) {
                        sum += notas[i];
                    }
                    double media = (double) sum / numAlumnos;
                    System.out.println("La media de las calificaciones es: " + media);

                    if (media >= 5) {
                        System.out.println("Calificación global: Aprobado");
                    } else {
                        System.out.println("Calificación global: Suspendido");
                    }
                    break;

                case 3:
                    if (numAlumnos == 0) {
                        System.out.println("No hay estudiantes registrados.");
                        break;
                    }

                    int max = BuscarMaximo(notas, numAlumnos);
                    int min = BuscarMinimo(notas, numAlumnos);
                    System.out.println("La nota más alta es: " + max);
                    System.out.println("La nota más baja es: " + min);
                    break;

                case 4:
                    if (numAlumnos == 0) {
                        System.out.println("No hay estudiantes registrados.");
                        break;
                    }

                    int aprobados = 0;
                    for (int n = 0; n < numAlumnos; n++) {
                        if (notas[n] >= 5) {
                            aprobados++;
                        }
                    }
                    System.out.println("Número de aprobados: " + aprobados);
                    System.out.println("Número de suspensos: " + (numAlumnos - aprobados));
                    break;

                case 5:
                    if (numAlumnos == 0) {
                        System.out.println("No hay estudiantes registrados.");
                        break;
                    }

                    System.out.print("¿Qué nombre desea buscar?: ");
                    String nomBuscado = scanner.nextLine();

                    boolean encontrado = false;
                    for (int k = 0; k < numAlumnos; k++) {
                        if (nomBuscado.equalsIgnoreCase(alumnos[k])) {
                            System.out.println("El alumno " + alumnos[k] + " tiene una calificación de: " + notas[k]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El alumno no se ha encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Número no válido. Inténtelo de nuevo.");
                    break;
            }

        } while (menu != 0);

        scanner.close();
    }

    public static int BuscarMaximo(int[] notas, int numAlumnos) {
        int maximo = notas[0];
        for (int n = 1; n < numAlumnos; n++) {
            if (maximo < notas[n]) {
                maximo = notas[n];
            }
        }
        return maximo;
    }

    public static int BuscarMinimo(int[] notas, int numAlumnos) {
        int minimo = notas[0];
        for (int n = 1; n < numAlumnos; n++) {
            if (minimo > notas[n]) {
                minimo = notas[n];
            }
        }
        return minimo;
    }
}

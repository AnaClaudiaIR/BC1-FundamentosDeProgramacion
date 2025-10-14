public class Estudiante{
    String nombre;
    int edad;
    String carrera;

    public void saludo() {
        System.out.println("Hola, soy " + this.nombre + ", tengo " + this.edad + " años y estudio " + this.carrera);
    }

    public void estudiar(String asignatura){
        System.out.println((this.nombre + " estudia " + asignatura)); //no se pone this porque es un método
    }

    /*Método estudiar que reciba una asignatura y muestre 
    el nombre del alumno y la asignatura */
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Celia";
        estudiante1.edad = 17;
        estudiante1.carrera = "Filologia inglesa";
        estudiante1.saludo();
        estudiante1.estudiar("Literatura medieval");
        estudiante1.estudiar("Cultura americana");

        System.out.println(" ");

        Estudiante estudiante2 = new Estudiante();

        estudiante2.nombre = "Luna";
        estudiante2.edad = 19;
        estudiante2.carrera = "Psicología";
        estudiante2.saludo();
        estudiante2.estudiar("Psicobiología");
        estudiante2.estudiar("Historia de la psicología");
    }
}




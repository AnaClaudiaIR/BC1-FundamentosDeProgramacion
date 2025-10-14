//EJEMPLO OBJETO JAVA 
public class Persona {
    String nombre;
    int edad;
    
    public void saludar() {
    System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.edad = 25;
        persona.saludar();

        Persona otraPersona = new Persona();
        otraPersona.nombre = "Nina";
        otraPersona.edad = 5;
        otraPersona.saludar();
    }
}


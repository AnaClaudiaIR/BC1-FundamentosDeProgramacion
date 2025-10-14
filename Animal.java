public class Animal {
    String nombre;
    String especie;
    int edad;


public void hacerSonido() {
    System.out.println("Hola, soy " + this.nombre + ", soy un/a " + this.especie + " y tengo " + this.edad + " años."); //This se pone delante del atributo, para especificar que no es la variable local (si la hubiera)
    }

public static void main(String[] args){
    Animal animal1 = new Animal();

    animal1.nombre =  "Nina";
    animal1.especie = "tortuga";
    animal1.edad = 5;
    animal1.hacerSonido();

    Animal animal2 = new Animal();

    animal2.nombre = "Rex";
    animal2.especie = "perro";
    animal2.edad = 10;
    animal2.hacerSonido();

    Animal animal3 = new Animal();

    animal3.nombre = "Tania";
    animal3.especie = "serpiente";
    animal3.edad = 4;
    animal3.hacerSonido();
    }
}



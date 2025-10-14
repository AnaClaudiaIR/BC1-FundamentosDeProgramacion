public class Main {
    public static void main(String[] args){
        int resultado = suma(5,3);
        System.out.println("La suma es: " + resultado);
    }
//Variable es entero, por tanto suma también debe serlo 
    public static int suma(int a, int b){ //metodo puede tener sus propias variables (como un programa aparte dentro del principal)
        //return a + b;
        int s;
        s = a + b;
        return s;
    }
}
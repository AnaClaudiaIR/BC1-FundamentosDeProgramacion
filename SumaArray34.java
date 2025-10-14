public class SumaArray34 {
    public static void main(String[] args){
        //1. Crear un array de dimensión 10
        int[] numeros = new int[10];

        //2. Pedir al usuario que números que meter
        for (j = 0; j<numeros.length; j++){
            System.out.println("Valor (entero): ");
            numeros[j] = scanner.nextInt();
        }

        int resultado = sumaElementosArray(numeros);
        System.out.println("La suma es: " + resultado);
    }
 
    public static int sumaElementosArray(int[] numeros){ //El array inicializado aquí es diferente al de arriba
        int sum; 
        for(x = 0; x<numeros.length; x++){
            sum = numeros[x] + sum;
        }
        return sum;
    }
}

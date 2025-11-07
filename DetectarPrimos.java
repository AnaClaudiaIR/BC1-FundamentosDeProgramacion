public class DetectarPrimos {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

        for(int n:numeros){
            if (esPrimo(n)){
                System.out.println(n + " es primo");
            } else {
                System.out.println(n + " no es primo");
            }

        }
    }

    public static boolean esPrimo(int n){
        //n son los números (posiciones) que se recorre en el array --> numeros[n]
        if (n<=1){
            return false;
        }

        for (int i = 2; i<=Math.sqrt(n); i++){
            //Se hace la raíz cuadrada porque se divide entre los números menores que este

            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}




public class InversoString {
    public static void main(String[] args) {
        String texto = "Nina es una tortuga";
        String invertido = "";

        System.out.println(texto);
        System.out.println("============");

         for (int i = texto.length() - 1; i >= 0; i--) { //Recorre el string desde el final (-1)
            invertido += texto.charAt(i); //Toma los caracteres del string y los añade a la frase
        }
        System.out.println(invertido);
    }
}



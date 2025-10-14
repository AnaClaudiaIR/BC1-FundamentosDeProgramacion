//PROGRAMA QUE IMPRIMA INFORMACION Y LA SINOPSIS DE UN LIBRO
public class Libro {
    String titulo;
    int yearPublicacion;
    String autor;

    public void informacion() {
        System.out.println("El libro " + this.titulo + " escrito por " + this.autor + " fue publicado en " + this.yearPublicacion);
        System.out.println(" ");
    }

    public void detalles(String sinopsis){
        System.out.println(this.titulo + " tiene la siguiente sinopsis: " + sinopsis);
        System.out.println(" ");
    }
    public static void main(String[] args){
        Libro libro1 = new Libro();

        libro1.titulo = "Noches Blancas";
        libro1.autor = "Fiódor Dostoyevski";
        libro1.yearPublicacion = 1848;
        libro1.informacion();
        libro1.detalles("Nastenka y un narrador se conocen en San Petersburgo, comparten cuatro noches de confidencias mientras ella espera a un amor ausente.");

        Libro libro2 = new Libro();

        libro2.titulo = "Las aventuras de Sherlock Holmes";
        libro2.autor = "Arthur Conan Doyle";
        libro2.yearPublicacion = 1892;
        libro2.informacion();
        libro2.detalles("Sherlock Holmes y el Dr. Watson resuelven misteriosos casos en Londres, enfrentando crímenes, engaños y acertijos con brillante deducción lógica.");

    }
}





public class Coche{
    String marca;
    String modelo;
    int year;
    double km;
    double litros;

    public static void main(String[] args){
        Coche coche1 = new Coche();

        coche1.marca = "Seat";
        coche1.modelo = "Ibiza";
        coche1.year = 1984;
        coche1.km = 6000; 
        coche1.litros = 30;
        coche1.informacion();
        coche1.encender();
        coche1.conducir(150);
        coche1.repostar(10);
        coche1.informacion(); 
        coche1.apagar();
    }

    public void encender(){ 
        System.out.println("El coche " + this.marca + " " + this.modelo + " es del año " + this.year + ". Está encendido."); 
    }

    public void apagar(){ 
        System.out.println("El coche " + this.marca + " " + this.modelo + " es del año " + this.year + ". Está apagado.");      
    }

    public void conducir(int kmRecorridos){
        this.km += kmRecorridos;
        double litrosGastados = kmRecorridos * 0.05;

        if(litrosGastados > this.litros){
            System.out.println("El coche no tiene suficientes litros para conducir " + kmRecorridos + " km.");
        } else {
            this.litros -= litrosGastados;
            this.km += kmRecorridos;
            System.out.println("Conduciendo " + kmRecorridos + " kilómetros en el " +this.modelo + ". Se gastaron " + litrosGastados);
        }
    }

    public void repostar(double litrosRepostados){
        this.litros += litrosRepostados;
        System.out.println("Repostando " + litrosRepostados + " litros en el " + this.marca + " " 
        + this.modelo + ". Ahora hay " + this.litros + " litros.");
    }

    public void informacion(){
        System.out.println("El coche " + this.marca + " " + this.modelo + " es del año " + 
        this.year + " y tiene " + this.km + " km, y tiene " + this.litros + " litros.");
    }
}





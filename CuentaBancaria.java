public class CuentaBancaria {
    String titular;
    double saldo;
    int numeroCuenta;

    public void mostrarInfo(){
        System.out.println("El titular " + this.titular + " con número de cuenta: " + this.numeroCuenta + ", tiene un saldo de: " + this.saldo + " euros.");
    }


    public void depositar(double cantidad){
        this.saldo += cantidad;
        System.out.println("se han depositado " + cantidad + " en la cuenta");
    }

    public void retirar(double cantidad){
        if (cantidad <= this.saldo){
            this.saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarSaldo(){
        System.out.println(this.titular + " tiene un saldo de " + this.saldo + " en la cuenta.");
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.titular = "Laura Gómez";
        cuenta.saldo = 3000;
        cuenta.numeroCuenta = 123456789; 
        cuenta.mostrarInfo();
        cuenta.mostrarSaldo();
        cuenta.depositar(0);
        cuenta.retirar(2000);
        cuenta.mostrarSaldo();
    }
}


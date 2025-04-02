public class CuentaBancaria {
    int numeroCuenta;
    int saldo;
    String titular;

    public CuentaBancaria (int numeroCuenta, int saldo, String titular){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(){
        System.out.println("Estas depositando " + saldo + " en la cuenta " + numeroCuenta + " de " + titular);
    }
    public void retirar(){
        System.out.println("Estas retirando " + saldo + " en la cuenta " + numeroCuenta + " de " + titular);
    }
}

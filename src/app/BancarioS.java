package app;
public class BancarioS {
    private String titular;
    private double saldo;

    public BancarioS(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Seu saldo: " + saldo);
    }

    public void depositar(double dinheiro) {
        saldo += dinheiro;
    }

    public void sacarDinheiro(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Não é possível sacar.");
        } else {
            saldo -= valor;
        }
    }

    public static void main(String[] args) {
        BancarioS guilherme = new BancarioS("Guilherme", 0);
        guilherme.depositar(50);
        guilherme.mostrarSaldo();

        guilherme.sacarDinheiro(200);
        guilherme.mostrarSaldo();
    }
}
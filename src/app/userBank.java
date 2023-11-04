package app;

public class userBank {
    private String name;
    private int conta;
    private double saldo;
    protected int senha;
    protected String tipo;
    private boolean status;

    public void abrirConta(){
    }
    public void fecharConta(){
    }
    public void depositar(){
    }
    public void sacar(){
    }
    public void pagarMensal(){
    }

    public userBank() {
    }

    public String getName() {
        return name;
    }

    public userBank setName(String name) {
        this.name = name;
        return this;
    }

    public int getConta() {
        return conta;
    }

    public userBank setConta(int conta) {
        this.conta = conta;
        return this;
    }

    public double getSaldo() {
        return saldo;
    }

    public userBank setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public int getSenha() {
        return senha;
    }

    public userBank setSenha(int senha) {
        this.senha = senha;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public userBank setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public boolean isStatus() {
        return status;
    }

    public userBank setStatus(boolean status) {
        this.status = status;
        return this;
    }
}
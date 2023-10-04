package Entities;

public class Conta {
    private String email;
    private String senha;

    private Double saldo;



    public Conta(String email, String senha, Double saldo) {
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
    }
    public Conta() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setDeposito(double deposito) {
        this.saldo += deposito;
    }
    public void setSaque(double saque) {
        this.saldo -= saque;
    }
}

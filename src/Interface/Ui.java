package Interface;

import Entities.Conta;

import java.util.Scanner;

public class Ui {
    static Scanner ler = new Scanner(System.in);
    public int menuLogin() {
        System.out.println("1. Criar conta");
        System.out.println("2. Fazer login");
        System.out.println("0. Sair");
        return ler.nextInt();

    }
    public int menuContas() {
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Ver saldo");
        System.out.println("4. PIX");
        System.out.println("0. Sair");
        return ler.nextInt();

    }
    public Conta cadastrarUsuario() {
        Conta conta = new Conta();
        System.out.println("Informe o email");
        ler.nextLine();
        String email = ler.nextLine();
        System.out.println("Informe a senha");
        String senha = ler.nextLine();

        System.out.println("Deseja realizar um deposito inicial?");
        String resp = ler.nextLine();

        if(resp.equalsIgnoreCase("Sim")) {
            System.out.println("Informe o deposito");
            Double saldo = ler.nextDouble();
            ler.nextLine();
            return new Conta(email, senha, saldo);
        } else {
            return new Conta(email, senha, 0.0);
        }
    }
}

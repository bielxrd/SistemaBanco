package Entities;

import Interface.Ui;


import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    static Scanner ler = new Scanner(System.in);

    public void criarConta(ArrayList<Conta> contas) {
        Ui interacao = new Ui();
        Conta conta = interacao.cadastrarUsuario();
        boolean vF = false;

        for(Conta item : contas) {
            if(item.getEmail().equalsIgnoreCase(conta.getEmail())) {
                vF = true;
                break;
            }
        }
        if(vF) {
            System.out.println("Este email ja foi utilizado para cadastro.");
        }
        else {
            System.out.println("Cadastrado com sucesso!");
            contas.add(conta);
        }

    }
    public boolean fazerLogin(ArrayList<Conta> contas) {
        boolean vF = false;
        System.out.println("Tela de LOGIN!");
        System.out.println("Informe o email para login");
        String email = ler.nextLine();
        System.out.println("Informe a senha");
        String senha = ler.nextLine();

        for (Conta item: contas) {
            if(item.getEmail().equalsIgnoreCase(email) && item.getSenha().equalsIgnoreCase(senha)) {
                System.out.println("Login feito com sucesso!");
                vF = true;
            }
            else if(item.getEmail().equalsIgnoreCase(email) && !item.getSenha().equalsIgnoreCase(senha)) {
                System.out.println("Senha incorreta.");
                vF = false;
            }
            else {
                System.out.println("Login nao existe.");
            }

        }
        return vF;
    }
}

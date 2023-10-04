package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoConta {
    static Scanner ler = new Scanner(System.in);

    public void depositar(ArrayList<Conta> contas) {
        System.out.println("Quanto deseja depositar?");
        double deposito = ler.nextDouble();

        for (Conta item : contas) {
            if (item.getEmail().equalsIgnoreCase(item.getEmailLogado())) {
                System.out.println("Deposito realizado com sucesso!");
                item.setSaldo(item.getSaldo() + deposito);
            } else {
                System.out.println("Deposito falhou!");
            }

        }
    }
    public void sacar(ArrayList<Conta> contas) {
        System.out.println("Quanto voce deseja sacar da sua conta?");
        double saque = ler.nextDouble();

        for(Conta item : contas) {
            if(item.getEmail().equalsIgnoreCase(item.getEmailLogado())) {
                if (item.getSaldo() == 0) {
                    System.out.println("Sem saldo na conta.");
                    break;
                }
                if(item.getSaldo() > saque || item.getSaldo() == saque) {
                    System.out.println("Saque realizado com sucesso.");
                    item.setSaldo(item.getSaldo() - saque);
                } else if (item.getSaldo() < saque) {
                    System.out.println("Saldo insuficiente para saque.");
                }
            }
            else {
                System.out.println("Saque falhou!");
            }
        }
    }

    public void exibirSaldo(ArrayList<Conta> contas) {
        for (Conta item : contas) {
            if (item.getEmail().equalsIgnoreCase(item.getEmailLogado())) {
                System.out.println("Saldo da conta: " + item.getSaldo());
            }
        }
    }
}

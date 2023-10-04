package Entities;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoConta extends Interface.Interface {
    static Scanner ler = new Scanner(System.in);

    public void depositar(ArrayList<Conta> contas) {

        System.out.println("Quanto deseja depositar?");
        double deposito = ler.nextDouble();

        System.out.println(login.getEmailLogado());
        for (Conta item : contas) {
            if (item.getEmail().equalsIgnoreCase(login.getEmailLogado())) {
                System.out.println("Deposito realizado com sucesso!");
                item.setDeposito(deposito);
                break;
            }


        }

    }

    public void sacar(ArrayList<Conta> contas) {
        System.out.println("Quanto voce deseja sacar da sua conta?");
        double saque = ler.nextDouble();

        for (Conta item : contas) {
            if (item.getEmail().equalsIgnoreCase(login.getEmailLogado())) {
                if (item.getSaldo() == 0) {
                    System.out.println("Sem saldo na conta.");
                }
                if (item.getSaldo() > saque || item.getSaldo() == saque) {
                    System.out.println("Saque realizado com sucesso.");
                    item.setSaque(saque);
                } else if (item.getSaldo() < saque) {
                    System.out.println("Saldo insuficiente para saque.");
                }

            }

        }

    }

    public void realizarPix(ArrayList<Conta> contas) {
        System.out.println("Informe o pix");
        String nome = ler.next();
        System.out.println("Quanto de pix deseja enviar? ");
        double pix = ler.nextDouble();

        for (Conta item : contas) {
            if (item.getEmail().equalsIgnoreCase(login.getEmailLogado())) {
                for (Conta itemA : contas) {
                    if (itemA.getEmail().equalsIgnoreCase(nome)) {
                        item.setSaque(pix);
                        itemA.setDeposito(pix);
                        System.out.println("Pix realizado com sucesso!");
                    }
                }
            }
        }
    }

    public void exibirSaldo(ArrayList<Conta> contas) {
        for (Conta item : contas) {
            if (item.getEmail().equalsIgnoreCase(login.getEmailLogado())) {
                System.out.println("Saldo da conta: " + item.getSaldo());
                break;
            }
        }
    }
}

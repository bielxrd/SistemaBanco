package Interface;

import Entities.Conta;
import Entities.GerenciamentoConta;
import Entities.Login;

import java.util.ArrayList;

public class Interface {
    static ArrayList<Conta> contas = new ArrayList<>();
    static Ui interacao = new Ui();
    static public Login login = new Login();
    static GerenciamentoConta gerenciamento = new GerenciamentoConta();

    public void exibirInterface() {
        int opcao = 0;
        int opcaoLogin = 0;

        do {
            opcao = interacao.menuLogin();

            if (opcao == 1) {
                login.criarConta(contas);

            } else if (opcao == 2) {
                login.fazerLogin(contas);

                if (login.isvF()) {
                    do {
                        opcaoLogin = interacao.menuContas();

                        if (opcaoLogin == 1) {
                            gerenciamento.sacar(contas);

                        } else if (opcaoLogin == 2) {
                            gerenciamento.depositar(contas);

                        } else if (opcaoLogin == 3) {
                            gerenciamento.exibirSaldo(contas);

                        } else if (opcaoLogin == 4) {
                            gerenciamento.realizarPix(contas);

                        }
                    } while (opcaoLogin != 0);
                }
            }
        } while (opcao != 0);


    }
}

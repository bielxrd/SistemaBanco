package Interface;

import Entities.Conta;
import Entities.Login;

import java.util.ArrayList;

public class Interface {
    static ArrayList<Conta> contas = new ArrayList<>();
    static Ui interacao = new Ui();
    static Login login = new Login();

    public void exibirInterface() {
        int opcao = 0;
        int opcaoLogin = 0;

        do {
            opcao = interacao.menuLogin();

            if (opcao == 1) {
                login.criarConta(contas);

            } else if (opcao == 2) {
                boolean vF = login.fazerLogin(contas);

                if (vF) {
                    do {
                        opcaoLogin = interacao.menuContas();

                        if (opcaoLogin == 1) {

                        } else if (opcaoLogin == 2) {


                        } else if (opcaoLogin == 3) {


                        } else if (opcaoLogin == 4) {


                        }
                    } while (opcaoLogin != 0);
                }
            }
        } while (opcao != 0);


    }
}

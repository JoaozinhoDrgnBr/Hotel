// Código principal, vai chamar os menus e as funções de cada menu
// Importando as classes necessárias
package src;

import src.Gerenciadores.GerenciadorCliente;
import src.Gerenciadores.GerenciadorPagamento;
import src.Gerenciadores.GerenciadorQuarto;
import src.Gerenciadores.GerenciadorReserva;

public class Main {

    public static void main(String[] args) {

        // gerenciadores
        GerenciadorQuarto gerenciadorQuarto = new GerenciadorQuarto();
        GerenciadorReserva gerenciadorReserva = new GerenciadorReserva();
        GerenciadorPagamento gerenciadorPagamento = new GerenciadorPagamento();
        GerenciadorCliente gerenciadorCliente = new GerenciadorCliente();

        // menu principal
        boolean sair = false;
        boolean erro = false;
        while (!sair) {

            //limpa a tela
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if(erro){
                System.out.println("Opção inválida, tente novamente");
            }
            System.out.println("Menu Principal");
            System.out.println("1 - Gerenciamento de Quartos");
            System.out.println("2 - Gerenciamento de Reservas");
            System.out.println("3 - Gerenciamento de Pagamentos");
            System.out.println("4 - Gerenciamento de Clientes");
            System.out.println("0 - Sair");
            int opcao = 0;
            try {
                erro = false;
                opcao = Integer.parseInt(System.console().readLine());
                //verificar se o usuário digitou um número
                switch (opcao) {
                    case 1:
                        gerenciadorQuarto.MenuQuarto();
                        break;
                    case 2:
                        gerenciadorReserva.MenuReserva();
                        break;
                    case 3:
                        gerenciadorPagamento.MenuPagamento();
                        break;
                    case 4:
                        gerenciadorCliente.MenuCliente();
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        erro = true;
                        break;
                }
            } catch (Exception e) {
                erro = true;
            }
        }
    }

}

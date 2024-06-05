package src.Gerenciadores;

import java.util.ArrayList;
import src.Quartos.Quarto;
import src.Utils;
import java.util.Scanner;

public class GerenciadorQuarto {

    //lista de quartos
    public ArrayList<Quarto> quartosList = new ArrayList<Quarto>();
    private Utils util = new Utils();
    private int opcao;

    // Menu de gerenciamento de quartos
    public void MenuQuarto() {

        boolean erro = false;
        boolean sair = false;
        while (!sair) {

            util.LimparTela();
            if (erro) {
                System.out.println("Opção inválida, tente novamente");
            }
            //limpa a tela
            System.out.println("Menu de gerenciamento de quartos");
            System.out.println("1 - Adicionar quarto");
            System.out.println("2 - Remover quarto");
            System.out.println("3 - Listar quartos");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(System.console().readLine());
                //verificar se o usuário digitou um número
                switch (opcao) {
                    case 1:
                        AdicionarQuarto();
                        break;
                    case 2:
                        RemoverQuarto();
                        break;
                    case 3:
                        ListarQuartos();
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

    // Adiciona um quarto
    public void AdicionarQuarto() {
        boolean erro = false;
        boolean sair = false;
        int numero = 0;
        double valorDiaria = 0;
        while (!sair) {
            try {
                if (erro) {
                    System.out.println("Opção inválida, tente novamente");
                    erro = false;
                    util.Enter();
                }
                //limpa a tela
                util.LimparTela();
                System.out.println("Adicionar quarto");
                try {
                    System.out.print("Digite o número do quarto: ");
                    numero = Integer.parseInt(System.console().readLine());
                    for (Quarto quarto : quartosList) {
                        if (quarto.getNumero() == numero) {
                            System.out.println("Quarto já cadastrado!");
                            util.Enter();
                            sair = true;
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Número inválido!");
                    util.Enter();
                    break;
                }

                try {
                    System.out.print("Digite o valor da diária: ");
                    valorDiaria = Double.parseDouble(System.console().readLine());
                    if (valorDiaria <= 0) {
                        System.out.println("Valor inválido!");
                        util.Enter();
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    util.Enter();
                    break;
                }

                Quarto quarto = new Quarto(numero, valorDiaria);
                quartosList.add(quarto);
                System.out.println("Quarto adicionado com sucesso!");
                util.Enter();
                sair = true;
            } catch (Exception e) {
                erro = true;
            }
        }
    }

    // Remove um quarto
    public void RemoverQuarto() {
        if (quartosList.size() == 0) {
            System.out.println("Nenhum quarto cadastrado!");
            util.Enter();
            return;
        }
        
        boolean erro = false;
        boolean sair = false;
        while (!sair) {
            try {
                if (erro) {
                    System.out.println("Opção inválida, tente novamente");
                    erro = false;
                    util.Enter();
                }
                //limpa a tela
                util.LimparTela();
                System.out.println("Remover quarto");
                System.out.print("Digite o número do quarto: ");
                try {
                    int numero = Integer.parseInt(System.console().readLine());
                    for (Quarto quarto : quartosList) {
                        if (quarto.getNumero() == numero) {
                            quartosList.remove(quarto);
                            System.out.println("Quarto removido com sucesso!");
                            util.Enter();
                            sair = true;
                            break;
                        }
                    }
                    if (!sair) {
                        System.out.println("Quarto não encontrado!");
                        util.Enter();
                        sair = true;
                    }
                } catch (Exception e) {
                    System.out.println("Número inválido!");
                    util.Enter();
                    sair = true;
                }
            } catch (Exception e) {
                erro = true;
            }
        }
    }

    // Lista os quartos
    public void ListarQuartos() {
        //limpa a tela
        util.LimparTela();
        if (quartosList.size() == 0) {
            System.out.println("Nenhum quarto cadastrado!");
            util.Enter();
        } else {
            for (Quarto quarto : quartosList) {
                System.err.println("---------------------------------");
                System.out.println(quarto.getDados());
            }
            util.Enter();
        }
    }

    public Quarto BuscarQuartoPorNumero(int numero) {
        for (Quarto quarto : quartosList) {
            if (quarto.getNumero() == numero) {
                return quarto;
            }
        }
        return null;
    }

}

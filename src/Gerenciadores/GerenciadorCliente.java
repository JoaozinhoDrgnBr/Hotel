package src.Gerenciadores;

import java.util.ArrayList;
import java.util.Scanner;
import src.Pessoa.Cliente;
import src.Utils;

public class GerenciadorCliente {

    //lista de clientes
    public ArrayList<Cliente> clientesList = new ArrayList<Cliente>();

    private Utils utils = new Utils();

    // Menu de gerenciamento de clientes
    public void MenuCliente() {
        boolean sair = false;
        boolean erro = false;
        while (!sair) {
            //limpa a tela
            utils.LimparTela();
            if (erro) {
                System.out.println("Opção inválida, tente novamente");
            }
            System.out.println("Menu de Clientes");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Editar Cliente");
            System.err.println("4 - Excluir Cliente");
            System.out.println("0 - Voltar");
            int opcao = 0;
            try {
                erro = false;
                opcao = Integer.parseInt(System.console().readLine());
                //verificar se o usuário digitou um número
                switch (opcao) {
                    case 1:
                        CadastrarCliente();
                        break;
                    case 2:
                        ListarClientes();
                        break;
                    case 3:
                        EditarCliente();
                        break;
                    case 4:
                        ExcluirCliente();
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

    // Cadastrar Cliente
    public void CadastrarCliente() {
        boolean erro = false;
        while (!erro) {
            //limpa a tela
            utils.LimparTela();
            try {
                System.out.println("Cadastro de Cliente");
                System.out.println("Digite o nome do cliente:");
                String nome = System.console().readLine();
                System.out.println("Digite o CPF do cliente:");
                String cpf = System.console().readLine();
                System.out.println("Digite o telefone do cliente:");
                String telefone = System.console().readLine();
                System.out.println("Digite o email do cliente:");
                String email = System.console().readLine();
                try {
                    Cliente cliente = new Cliente(nome, cpf, telefone, email);
                    clientesList.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso");
                    utils.Enter();
                    erro = true;
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar cliente, tente novamente");
                    System.out.println("Pressione enter para continuar");
                    Scanner scanner = new Scanner(System.in);
                }
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar cliente, tente novamente");
                utils.Enter();
            }
        }
    }

    // Listar Clientes
    public void ListarClientes() {
        //limpa a tela
        utils.LimparTela();
        try {
            //verificar se a lista de clientes está vazia
            if (clientesList.isEmpty()) {
                System.out.println("Nenhum cliente cadastrado");
                utils.Enter();
                return;
            }
            System.out.println("Lista de Clientes");
            for (int i = 0; i < clientesList.size(); i++) {
                System.out.println("Cliente " + i);
                System.out.println("Nome: " + clientesList.get(i).getNome());
                System.out.println("CPF: " + clientesList.get(i).getCpf());
                System.out.println("Telefone: " + clientesList.get(i).getTelefone());
                System.out.println("Email: " + clientesList.get(i).getEmail());
                System.out.println("-------------------------------------------------");
                utils.Enter();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao listar os clientes, tente novamente");
            utils.Enter();
        }
    }

    // Editar Cliente
    public void EditarCliente() {
        boolean erro = false;
        while (!erro) {
            //limpa a tela
            utils.LimparTela();
            try {
                System.out.println("Editar Cliente");
                System.out.println("Digite o CPF do cliente que deseja editar:");
                String cpf = System.console().readLine();
                for (int i = 0; i < clientesList.size(); i++) {
                    if (clientesList.get(i).getCpf().equals(cpf)) {
                        System.out.println("Digite o novo nome do cliente:");
                        String nome = System.console().readLine();
                        System.out.println("Digite o novo CPF do cliente:");
                        String novoCpf = System.console().readLine();
                        System.out.println("Digite o novo telefone do cliente:");
                        String telefone = System.console().readLine();
                        System.out.println("Digite o novo email do cliente:");
                        String email = System.console().readLine();
                        try {
                            clientesList.get(i).setNome(nome);
                            clientesList.get(i).setCpf(novoCpf);
                            clientesList.get(i).setTelefone(telefone);
                            clientesList.get(i).setEmail(email);
                            System.out.println("Cliente editado com sucesso");
                            utils.Enter();
                            erro = true;
                        } catch (Exception e) {
                            System.out.println("Erro ao editar cliente, tente novamente");
                            utils.Enter();
                        }
                    }
                }
                if (!erro) {
                    System.out.println("Cliente não encontrado");
                    utils.Enter();
                    erro = true;
                }
            } catch (Exception e) {
                System.out.println("Erro ao editar cliente, tente novamente");
                utils.Enter();
            }
        }
    }

    // Excluir Cliente
    public void ExcluirCliente() {
        boolean erro = false;
        while (!erro) {
            //limpa a tela
            utils.LimparTela();
            try {
                System.out.println("Excluir Cliente");
                System.out.println("Digite o CPF do cliente que deseja excluir:");
                String cpf = System.console().readLine();
                for (int i = 0; i < clientesList.size(); i++) {
                    if (clientesList.get(i).getCpf().equals(cpf)) {
                        clientesList.remove(i);
                        System.out.println("Cliente excluído com sucesso");
                        utils.Enter();
                        erro = true;
                    }
                }
                if (!erro) {
                    System.out.println("Cliente não encontrado");
                    utils.Enter();
                    erro = true;
                }
            } catch (Exception e) {
                System.out.println("Erro ao excluir cliente, tente novamente");
                utils.Enter();
            }
        }
    }
}

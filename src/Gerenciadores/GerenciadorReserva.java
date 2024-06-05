package src.Gerenciadores;

import java.util.ArrayList;
import src.Pessoa.Cliente;
import src.Quartos.Quarto;
import src.Quartos.Reserva;
import src.Quartos.ServicoCafe;
import src.Quartos.ServicoAlmoco;
import src.Quartos.ServicoJantar;
import src.Interfaces.IReserva;
import src.Utils;

public class GerenciadorReserva {

    //lista de reservas
    public ArrayList<IReserva> reservasList = new ArrayList<IReserva>();
    Utils utils = new Utils();

    // Menu de gerenciamento de reservas
    public void MenuReserva(GerenciadorCliente gerenciadorCliente, GerenciadorQuarto gerenciadorQuarto) {
        boolean sair = false;
        boolean erro = false;
        while (!sair) {
            //limpa a tela"""
            utils.LimparTela();
            if (erro) {
                System.out.println("Opção inválida, tente novamente");
            }
            System.out.println("Menu de Reservas");
            System.out.println("1 - Cadastrar Reserva");
            System.out.println("2 - Listar Reservas");
            System.out.println("3 - Editar Reserva");
            System.out.println("4 - Excluir Reserva");
            System.out.println("5 - Contratar Serviços Adicionais");
            System.out.println("0 - Voltar");
            try {
                int opcao = Integer.parseInt(System.console().readLine());
                //verificar se o usuário digitou um número
                switch (opcao) {
                    case 1:
                        CadastrarReserva(gerenciadorCliente, gerenciadorQuarto);
                        break;
                    case 2:
                        ListarReservas();
                        break;
                    case 3:
                        EditarReserva(gerenciadorCliente, gerenciadorQuarto);
                        break;
                    case 4:
                        ExcluirReserva(gerenciadorCliente, gerenciadorQuarto);
                        break;
                    case 5:
                        ContratarServicosAdicionais();
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        erro = true;
                        break;
                }
            } catch (Exception e) {
                //System.out.println(e);
                //System.out.println("linha 59");
                //utils.Enter();
                erro = true;
            }
        }
    }
    // Cadastrar reserva

    public void CadastrarReserva(GerenciadorCliente gerenciadorCliente, GerenciadorQuarto gerenciadorQuarto) {
        //limpa a tela
        utils.LimparTela();
        Cliente cliente = null;
        try {
            System.out.println("Cadastrar Reserva");
            System.out.println("Digite o CPF do cliente:");
            String cpf = System.console().readLine();
            cliente = gerenciadorCliente.BuscarClientePorCPF(cpf);
            //System.out.println(cliente.getDados()); //debug
            //utils.Enter();
        } catch (Exception e) {
            System.out.println(e);
            //System.out.println("linha 78");
            utils.Enter();
            return;
        }
        if (cliente == null) {
            utils.LimparTela();
            System.out.println("Cliente não encontrado");
            utils.Enter();
            return;
        }
        System.out.println("Digite o número do quarto:");
        int numero = Integer.parseInt(System.console().readLine());
        Quarto quarto = gerenciadorQuarto.BuscarQuartoPorNumero(numero);
        if (quarto == null) {
            utils.LimparTela();
            System.out.println("Quarto não encontrado");
            utils.Enter();
            return;
        }
        System.out.println("Digite a data de entrada:");
        String dataEntrada = System.console().readLine();
        System.out.println("Digite a data de saída:");
        String dataSaida = System.console().readLine();
        try {
            IReserva reserva = new Reserva(dataEntrada, dataSaida, cliente, quarto, quarto.getPreco());
            reservasList.add(reserva);
            System.out.println("Reserva cadastrada com sucesso");
            utils.Enter();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar reserva");
            utils.Enter();
        }
    }

    // Lista as reservas
    public void ListarReservas() {
        //limpa a tela
        utils.LimparTela();
        if (reservasList.size() == 0) {
            System.out.println("Nenhuma reserva cadastrada!");
            utils.Enter();
        } else {
            for (IReserva reserva : reservasList) {
                System.err.println("---------------------------------");
                System.out.println(reserva.GetDados());
            }
            utils.Enter();
        }
    }

    // Editar reserva
    public void EditarReserva(GerenciadorCliente gerenciadorCliente, GerenciadorQuarto gerenciadorQuarto) {
        //limpa a tela
        utils.LimparTela();
        System.out.println("Editar Reserva");
        System.out.println("Digite o CPF do cliente:");
        String cpf = System.console().readLine();
        Cliente cliente = gerenciadorCliente.BuscarClientePorCPF(cpf);
        if (cliente == null) {
            utils.LimparTela();
            System.out.println("Cliente não encontrado");
            utils.Enter();
            return;
        }
        System.out.println("Digite o número do quarto:");
        int numero = Integer.parseInt(System.console().readLine());
        Quarto quarto = gerenciadorQuarto.BuscarQuartoPorNumero(numero);
        if (quarto == null) {
            utils.LimparTela();
            System.out.println("Quarto não encontrado");
            utils.Enter();
            return;
        }
        System.out.println("Digite a data de entrada:");
        String dataEntrada = System.console().readLine();
        System.out.println("Digite a data de saída:");
        String dataSaida = System.console().readLine();
        Reserva reserva = new Reserva(dataEntrada, dataSaida, cliente, quarto, quarto.getPreco());
        reservasList.add(reserva);
        System.out.println("Reserva editada com sucesso");
        utils.Enter();
    }

    // Excluir reserva
    public void ExcluirReserva(GerenciadorCliente gerenciadorCliente, GerenciadorQuarto gerenciadorQuarto) {
        boolean erro = false;
        while (!erro) {
            //limpa a tela
            utils.LimparTela();
            try {
                System.out.println("Excluir Reserva");
                System.out.println("Digite o CPF do cliente:");
                String cpf = System.console().readLine();
                Cliente cliente = gerenciadorCliente.BuscarClientePorCPF(cpf);
                if (cliente == null) {
                    utils.LimparTela();
                    System.out.println("Cliente não encontrado");
                    utils.Enter();
                    return;
                }
                System.out.println("Digite o número do quarto:");
                int numero = Integer.parseInt(System.console().readLine());
                Quarto quarto = gerenciadorQuarto.BuscarQuartoPorNumero(numero);
                if (quarto == null) {
                    utils.LimparTela();
                    System.out.println("Quarto não encontrado");
                    utils.Enter();
                    return;
                }
                for (int i = 0; i < reservasList.size(); i++) {
                    if (reservasList.get(i).GetCliente().getCpf().equals(cpf) && reservasList.get(i).GetQuarto().getNumero() == numero) {
                        reservasList.remove(i);
                        System.out.println("Reserva excluída com sucesso");
                        utils.Enter();
                        erro = true;
                    }
                }
                if (!erro) {
                    System.out.println("Reserva não encontrada");
                    utils.Enter();
                    erro = true;
                }
            } catch (Exception e) {
                System.out.println("Erro ao excluir reserva, tente novamente");
                utils.Enter();
            }
        }
    }

    // Contratar serviços adicionais
    public void ContratarServicosAdicionais() {
        //limpa a tela
        utils.LimparTela();

        System.out.println("Contratar Serviços Adicionais");
        System.out.println("Digite o CPF do cliente:");
        String cpf = "";
        try {
            cpf = System.console().readLine();
        } catch (Exception e) {
            System.out.println("Erro ao contratar serviços adicionais, tente novamente");
            utils.Enter();
            return;
        }

        Reserva reservaAux = null;
        for (IReserva reserva : reservasList) {
            if (reserva.GetCliente().getCpf().equals(cpf)) {

                System.out.println("Serviços disponíveis:");
                System.out.println("1 - Café da manhã");
                System.out.println("2 - Almoço");
                System.out.println("3 - Jantar");

                int opcao = 0;
                try {
                    opcao = Integer.parseInt(System.console().readLine());
                } catch (Exception e) {
                    System.out.println("Erro ao contratar serviços adicionais, tente novamente");
                    utils.Enter();
                    return;
                }
                switch (opcao) {
                    case 1:
                        reserva = new ServicoCafe(reserva);
                        System.out.println("Café da manhã contratado com sucesso");
                        utils.Enter();
                        break;
                    case 2:
                        reserva = new ServicoAlmoco(reserva);
                        System.out.println("Almoço contratado com sucesso");
                        utils.Enter();
                    case 3:
                        reserva = new ServicoJantar(reserva);
                        System.out.println("Jantar contratado com sucesso");
                        utils.Enter();
                    default:
                        System.out.println("Opção inválida");
                        utils.Enter();
                        break;
                }
            }
        }

    }
}

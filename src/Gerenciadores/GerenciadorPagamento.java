package src.Gerenciadores;

import src.Interfaces.IReserva;
import src.Interfaces.PagamentoStrategy;
import src.Pagamentos.Pagamento;
import src.Pagamentos.PagamentoDebito;
import src.Pagamentos.PagamentoDinheiro;
import src.Pagamentos.PagamentoPix;
import src.Quartos.Reserva;
import src.Utils;

public class GerenciadorPagamento {

    private Utils utils = new Utils();
    private PagamentoDebito strategyDebito = new PagamentoDebito();
    private PagamentoDinheiro strategyDinheiro = new PagamentoDinheiro();
    private PagamentoPix strategyPix = new PagamentoPix();

    public void MenuPagamento(GerenciadorReserva gerenciadorReserva) {
        boolean sair = false;
        boolean erro = false;
        int opcao = 0;
        while (!sair) {

            if (erro) {
                System.out.println("Opção inválida, tente novamente");
                erro = false;
            }
            System.out.println("Menu de Pagamento");
            System.out.println("1 - Pagar com Cartão de Débito");
            System.out.println("2 - Pagar com Dinheiro");
            System.out.println("3 - Pagar com Pix");
            System.out.println("0 - Voltar");
            try {
                opcao = Integer.parseInt(System.console().readLine());
                switch (opcao) {
                    case 1:
                        Pagamento(gerenciadorReserva, strategyDebito); // pagar com cartão de débito
                        break;
                    case 2:
                        Pagamento(gerenciadorReserva, strategyDinheiro); // pagar com dinheiro
                        break;
                    case 3:
                        Pagamento(gerenciadorReserva, strategyPix); // pagar com pix
                        break;
                    case 0:
                        sair = true;
                        break;
                    default:
                        erro = true;
                        break;
                }
            } catch (NumberFormatException e) {
                erro = true;

            }

        }
    }

    private void Pagamento(GerenciadorReserva gerenciadorReserva, PagamentoStrategy strategy) {
        // primeiro, pegar a reserva
        System.out.println("Digite o cpf do cliente:");
        String cpf = System.console().readLine();
        IReserva reserva = null;
        try {
            reserva = gerenciadorReserva.GetReservaPorCpf(cpf);

            String data = System.console().readLine("Digite a data de pagamento: ");

            // agora, pagar
            double valor = reserva.GetCusto();
            System.out.println("Pagando R$ " + valor);
            Pagamento pagamento = new Pagamento(valor, reserva.GetCliente(), (Reserva) reserva, data, strategy);
            pagamento.Pagar();
            reserva.SetStatus(IReserva.Status.CHECKOUT);
        } catch (Exception e) {
            System.out.println("Reserva não encontrada");
            return;
        }
    }

}

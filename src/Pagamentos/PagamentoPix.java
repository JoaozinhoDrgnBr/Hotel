package Pagamentos;

import Interfaces.PagamentoStrategy;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void Pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}

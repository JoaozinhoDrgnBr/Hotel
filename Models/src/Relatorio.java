import java.time.LocalDate;

public class Relatorio {
    private String tipo;
    private LocalDate dataDeGeracao;

    // Construtor
    public Relatorio(String tipo, LocalDate dataDeGeracao) {
        this.tipo = tipo;
        this.dataDeGeracao = dataDeGeracao;
    }

    // Método para gerar relatório financeiro
    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando Relatório Financeiro...");
        // Implementação do método para gerar o relatório financeiro
    }

    // Método para gerar relatório de ocupação
    public void gerarRelatorioDeOcupacao() {
        System.out.println("Gerando Relatório de Ocupação...");
        // Implementação do método para gerar o relatório de ocupação
    }


    @Override
    public String toString() {
        return "Relatorio{" +
                "tipo='" + tipo + '\'' +
                ", dataDeGeracao=" + dataDeGeracao +
                '}';
    }
}
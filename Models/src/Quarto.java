import java.util.List;

public class Quarto {
    private int numero;
    private String tipo;
    private double preco;
    private String status;  // "disponível" ou "ocupado"

    // Construtor
    public Quarto(int numero, String tipo, double preco, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.status = status;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método para verificar disponibilidade
    public boolean verificarDisponibilidade() {
        return "disponível".equalsIgnoreCase(this.status);
    }

    // Método para atualizar o status do quarto
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    // Métodos estáticos para adicionar e remover quartos de uma lista
    public static void adicionarQuarto(List<Quarto> quartos, Quarto quarto) {
        quartos.add(quarto);
    }

    public static void removerQuarto(List<Quarto> quartos, Quarto quarto) {
        quartos.remove(quarto);
    }

    // Método toString para representação do quarto
    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", status='" + status + '\'' +
                '}';
    }
}
import java.time.LocalDate;

public class Pagamento {
    private int id;
    private double valor;
    private String metodoPagamento;
    private LocalDate data;
    private String status;

    // Construtor
    public Pagamento(int id, double valor, String metodoPagamento, LocalDate data, String status) {
        this.id = id;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.data = data;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método para processar o pagamento
    public void processarPagamento() {
        this.status = "processado";
    }

    // Método para emitir o recibo
    public void emitirRecibo() {
        System.out.println("Recibo do Pagamento #" + id);
        System.out.println("Data: " + data);
        System.out.println("Valor: " + valor);
        System.out.println("Método de Pagamento: " + metodoPagamento);
    }

    // Método toString para representação do pagamento
    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", valor=" + valor +
                ", metodoPagamento='" + metodoPagamento + '\'' +
                ", data=" + data +
                ", status='" + status + '\'' +
                '}';
    }
}
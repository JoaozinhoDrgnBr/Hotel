import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Quarto quarto;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private String status;  // "ativa" ou "cancelada"

    // Construtor
    public Reserva(int id, Cliente cliente, Quarto quarto, LocalDate dataCheckIn, LocalDate dataCheckOut, String status) {
        this.id = id;
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método para confirmar a reserva
    public void confirmarReserva() {
        this.status = "ativa";
    }

    // Método para cancelar a reserva
    public void cancelarReserva() {
        this.status = "cancelada";
    }

    // Métodos estáticos para adicionar e remover reservas de uma lista
    public static void adicionarReserva(List<Reserva> reservas, Reserva reserva) {
        reservas.add(reserva);
    }

    public static void removerReserva(List<Reserva> reservas, Reserva reserva) {
        reservas.remove(reserva);
    }

    // Método toString para representação da reserva
    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", quarto=" + quarto +
                ", dataCheckIn=" + dataCheckIn +
                ", dataCheckOut=" + dataCheckOut +
                ", status='" + status + '\'' +
                '}';
    }
}
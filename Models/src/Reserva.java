import java.util.Date;
import java.util.List;

public class Reserva{
    public enum Status{
        PENDENTE,
        CANCELADO,
        CHECKIN,
        CHECKOUT
    }
    private Cliente cliente;
    private Quarto quarto;
    private Date dataInicio;
    private Date dataFim;
    private Status status;
    private List<Servico> servicos;

    
    public Reserva(Date dataEntrada, Date dataSaida, Cliente cliente, Quarto quarto){
        this.dataInicio = dataEntrada;
        this.dataFim = dataSaida;
        this.cliente = cliente;
        this.quarto = quarto;
        this.status = Status.PENDENTE;
    }

    public void setDataEntrada(String dataEntrada){
        this.dataInicio = dataEntrada;
    }

    public String getDataEntrada(){
        return this.dataInicio;
    }

    public void setDataSaida(String dataSaida){
        this.dataFim = dataSaida;
    }

    public String getDataSaida(){
        return this.dataFim;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setQuarto(Quarto quarto){
        this.quarto = quarto;
    }

    public Quarto getQuarto(){
        return this.quarto;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
    }

    public void getDados(){
        return "Data de Entrada: " + this.dataInicio + "Data de Saida: " + this.dataFim + "Cliente: " + this.cliente.getNome() + "Quarto: " + this.quarto.getNumero() + "Status: " + this.status;
    }

    private void CancelarReserva(){
        // cancelar uma reserva e setar o status para cancelado e o status do quarto para livre
    }

    private void ConfirmarReserva(){
        // confirmar uma reserva e setar o status para checkin e o status do quarto para ocupado
    }
}
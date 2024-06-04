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

    
    public Reserva(string dataEntrada, string dataSaida, Cliente cliente, Quarto quarto){
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cliente = cliente;
        this.quarto = quarto;
        this.status = Status.Pendente;
    }

    public void setDataEntrada(string dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public string getDataEntrada(){
        return this.dataEntrada;
    }

    public void setDataSaida(string dataSaida){
        this.dataSaida = dataSaida;
    }

    public string getDataSaida(){
        return this.dataSaida;
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
        return "Data de Entrada: " + this.dataEntrada + "Data de Saida: " + this.dataSaida + "Cliente: " + this.cliente.getNome() + "Quarto: " + this.quarto.getNumero() + "Status: " + this.status;
    }

    private void CancelarReserva(){
        // cancelar uma reserva e setar o status para cancelado e o status do quarto para livre
    }

    private void ConfirmarReserva(){
        // confirmar uma reserva e setar o status para checkin e o status do quarto para ocupado
    }
}
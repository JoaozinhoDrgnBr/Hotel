public class Pagamento{
    public enum Status{
        PENDENTE,
        PAGO,
        CANCELADO
    }
    private double preco;
    private Cliente cliente;
    private Status status;
    private Date data;
    private Reserva reserva;

    public Pagamento(double preco, Cliente cliente, Reserva reserva){
        this.preco = preco;
        this.cliente = cliente;
        this.reserva = reserva;
        this.status = Status.PENDENTE;
        this.data = new Date();
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
    }

    public void setData(Date data){
        this.data = data;
    }

    public Date getData(){
        return this.data;
    }

    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }

    public Reserva getReserva(){
        return this.reserva;
    }

    private void getDados(){
        return "Preco: " + this.preco + "Cliente: " + this.cliente.getNome() + "Status: " + this.status + "Data: " + this.data + "Reserva: " + this.reserva.getDados();
    }

    private void Pagar(){
        // realizar o pagamento
    }
}
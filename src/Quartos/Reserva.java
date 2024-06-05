package src.Quartos;

import src.Interfaces.IReserva;
import src.Pessoa.Cliente;

public class Reserva implements IReserva{
    public enum Status{
        PENDENTE,
        CANCELADO,
        CHECKIN,
        CHECKOUT
    }
    private Cliente cliente;
    private Quarto quarto;
    private String dataInicio;
    private String dataFim;
    private Status status;
    private double custo;
    
    public Reserva(String dataEntrada, String dataSaida, Cliente cliente, Quarto quarto){
        this.dataInicio = dataEntrada;
        this.dataFim = dataSaida;
        this.cliente = cliente;
        this.quarto = quarto;
        this.status = Status.PENDENTE;
        this.custo = quarto.getPreco();
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

    @Override 
    public String GetDescricao(){
        // retornar a descrição da reserva
        return "Reserva do quarto " + this.quarto.getNumero() + " para o cliente " + this.cliente.getNome();
    }

    @Override
    public double GetCusto(){
        // retornar o custo da reserva
        return this.custo;
    }

    private void CancelarReserva(){
        // cancelar uma reserva e setar o status para cancelado e o status do quarto para livre
    }

    private void ConfirmarReserva(){
        // confirmar uma reserva e setar o status para checkin e o status do quarto para ocupado
    }
}
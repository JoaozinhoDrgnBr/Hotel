package Pagamentos;

import Observer.Observable;
import Pessoa.Cliente;
import src.Quartos.Reserva;
import src.Interfaces.PagamentoStrategy;

public class Pagamento extends Observable {
    public enum Status{
        PENDENTE,
        PAGO,
        CANCELADO
    }
    private double preco;
    private Cliente cliente;
    private Status status;
    private String data;
    private Reserva reserva;
    private PagamentoStrategy strategy;

    public Pagamento(double preco, Cliente cliente, Reserva reserva, String data, PagamentoStrategy strategy){
        this.preco = preco;
        this.cliente = cliente;
        this.reserva = reserva;
        this.status = Status.PENDENTE;
        this.data = data;
        this.strategy = strategy;
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
        addObserver(this.cliente); //tem que ver isso aqui se vai dar certo se ele fica adicionando vários cliente ou não
        this.status = status;
        notifyObservers(String.valueOf(status));
    }

    public Status getStatus(){
        return this.status;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }

    public Reserva getReserva(){
        return this.reserva;
    }

    private String getDados(){
        return "Preco: " + this.preco + "Cliente: " + this.cliente.getNome() + "Status: " + this.status + "Data: " + this.data + "Reserva: " + this.reserva.getDados();
    }

    private void Pagar(){
        strategy.Pagar(reserva.getPreco());
    }
}
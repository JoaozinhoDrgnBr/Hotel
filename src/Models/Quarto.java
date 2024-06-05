package Models;

import Interfaces.Estado;

public class Quarto{
    private Estado estado;
    private int numero;
    private double preco;

    public Quarto(int numero, double preco){
        this.numero = numero;
        this.preco = preco;
        this.estado = new Disponivel();
    }


    public String getDados(){
        return ("Numero: " + this.numero + "Preco: " + this.preco + "Status: " + this.estado);
    }

    public void setEstado(Estado e){
        this.estado = e;
    }

    public Estado getStatus(){
        return this.estado;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    private void Alugar(){
        estado.Alugar(this);
    }

    private void CheckOut(){
        estado.Checkout(this);
    }   

    private void CheckIn(){
        estado.Checkin(this);
    }
}




package src.Quartos;

public class Quarto{
    public enum Status{
        LIVRE,
        OCUPADO,
        LIMPEZA
    }
    private Status status;
    private int numero;
    private double preco;

    public Quarto(int numero, double preco){
        this.numero = numero;
        this.preco = preco;
        this.status = Status.LIVRE;
    }


    public String getDados(){
        return "Numero: " + this.numero + "Preco: " + this.preco + "Status: " + this.status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
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
        // criar uma reserva e setar o status do quarto para ocupado, e realizar o checkin utiilizando a reserva criada
    }

    private void CheckOut(){
        // realizar o checkout e setar o status do quarto para limpeza chamando o pagamento
    }   

    private void CheckIn(){
        // realizar o checkin com uma reserva
    }
}




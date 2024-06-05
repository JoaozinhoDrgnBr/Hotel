package src.Interfaces;

import src.Pessoa.Cliente;
import src.Quartos.Quarto;

public interface IReserva {
    public enum Status {
        PENDENTE,
        CANCELADO,
        CHECKIN,
        CHECKOUT;
    }
    
    String GetDescricao();
    double GetCusto();
    Cliente GetCliente();
    Quarto GetQuarto();
    String GetDados();
    void SetStatus(Status status);
}

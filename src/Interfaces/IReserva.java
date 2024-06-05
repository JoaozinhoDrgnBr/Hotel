package src.Interfaces;

import src.Pessoa.Cliente;
import src.Quartos.Quarto;

public interface IReserva {
    
    String GetDescricao();
    double GetCusto();
    Cliente GetCliente();
    Quarto GetQuarto();
    String GetDados();
}

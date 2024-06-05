package src.Quartos;

import src.Decorators.DecoReserva;
import src.Interfaces.IReserva;
import src.Pessoa.Cliente;

public class ServicoJantar extends DecoReserva {

    public ServicoJantar(IReserva reservaDecorada) {
        super(reservaDecorada);
    }

    @Override
    public String GetDescricao() {
        return reserva.GetDescricao() + " + com jantar";
    }

    @Override
    public double GetCusto() {
        return reserva.GetCusto() + 30.0;
    }

    @Override
    public String GetDados() {
        return reserva.GetDados() + "\nServiço de Almoço: R$30,00";
    }

    @Override
    public Cliente GetCliente() {
        return reserva.GetCliente();
    }

    @Override
    public Quarto GetQuarto() {
        return reserva.GetQuarto();
    }

    @Override
    public void SetStatus(IReserva.Status status) {
        reserva.SetStatus(status);
    }
    
}

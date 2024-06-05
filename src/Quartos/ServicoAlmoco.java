package src.Quartos;

import src.Decorators.DecoReserva;
import src.Interfaces.IReserva;
import src.Pessoa.Cliente;

public class ServicoAlmoco extends DecoReserva {

    public ServicoAlmoco(IReserva reservaDecorada) {
        super(reservaDecorada);
    }

    @Override
    public String GetDescricao() {
        return reserva.GetDescricao() + " + com almoço";
    }

    @Override
    public double GetCusto() {
        return reserva.GetCusto() + 20.0;
    }

    @Override
    public String GetDados() {
        return reserva.GetDados() + "\nServiço de Almoço: R$20,00";
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

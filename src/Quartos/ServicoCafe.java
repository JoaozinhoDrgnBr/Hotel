package src.Quartos;

import src.Decorators.DecoReserva;
import src.Interfaces.IReserva;
import src.Pessoa.Cliente;

public class ServicoCafe extends DecoReserva {

    public ServicoCafe(IReserva reservaDecorada) {
        super(reservaDecorada);
    }

    @Override
    public String GetDescricao() {
        return reserva.GetDescricao() + " + com café";
    }

    @Override
    public double GetCusto() {
        return reserva.GetCusto() + 10.0;
    }

    @Override
    public String GetDados() {
        return reserva.GetDados() + "\nServiço de Almoço: R$10,00";
    }

    @Override
    public Cliente GetCliente() {
        return reserva.GetCliente();
    }

    @Override
    public Quarto GetQuarto() {
        return reserva.GetQuarto();
    }
}

package src.Quartos;

import src.Decorators.DecoReserva;
import src.Interfaces.IReserva;

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
}

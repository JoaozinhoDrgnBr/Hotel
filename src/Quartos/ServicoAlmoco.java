package src.Quartos;

import src.Decorators.DecoReserva;
import src.Interfaces.IReserva;

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
    
}

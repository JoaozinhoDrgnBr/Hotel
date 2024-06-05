package src.Quartos;

import src.Decorators.DecoReserva;
import src.Interfaces.IReserva;

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
    
}

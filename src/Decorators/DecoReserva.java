package src.Decorators;

import src.Interfaces.IReserva;

public abstract class DecoReserva implements IReserva{
    protected IReserva reserva;

    public DecoReserva(IReserva reserva){
        this.reserva = reserva;
    }

    @Override
    public String GetDescricao() {
        return reserva.GetDescricao();
    }

    @Override
    public double GetCusto() {
        return reserva.GetCusto();
    }
}

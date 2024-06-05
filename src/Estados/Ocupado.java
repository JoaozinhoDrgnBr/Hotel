package src.Estados;

import src.Interfaces.Estado;
import src.Quartos.Quarto;

public class Ocupado implements Estado {
    @Override
    public void Alugar(Quarto quarto) {
        System.out.println("Quarto já está ocupado!.");
    }

    @Override
    public void Checkin(Quarto quarto) {

        System.out.println("Quarto já está ocupado!.");
    }

    @Override
    public void Checkout(Quarto quarto) {
        System.out.println("Quarto agora se encontra disonível.");
        quarto.setEstado(new Disponivel());
    }

    @Override
    public String GetEstado() {
        return "Ocupado";
    }
}

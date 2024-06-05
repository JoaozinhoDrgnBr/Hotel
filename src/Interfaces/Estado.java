package src.Interfaces;

import src.Quartos.Quarto;
public interface Estado {
    void Alugar(Quarto quarto);
    void Checkout(Quarto quarto);
    void Checkin(Quarto quarto);
    String GetEstado();
}

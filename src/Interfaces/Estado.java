package Interfaces;
import Models.Quarto;

public interface Estado {
    void Alugar(Quarto quarto);
    void Checkout(Quarto quarto);
    void Checkin(Quarto quarto);
}

package Estados;

public class Disponivel implements Estado {
    @Override
    public void Alugar(Quarto quarto) {
        System.out.println("Quarto reservado com sucesso.");
        quarto.setEstado(new Ocupado());
    }

    @Override
    public void Checkin(Quarto quarto) {

        System.out.println("Reserva confirmada com sucesso.");
        quarto.setEstado(new Ocupado());
    }

    @Override
    public void Checkout(Quarto quarto) {
        System.out.println("O quarto não está ocupado.");
    }
}
public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private String horarioDeTrabalho;

    // Construtor
    public Funcionario(int id, String nome, String cargo, double salario, String horarioDeTrabalho) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    // Método toString para representação do funcionário
    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", horarioDeTrabalho='" + horarioDeTrabalho + '\'' +
                '}';
    }
}
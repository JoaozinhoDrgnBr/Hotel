import java.util.ArrayList;
import java.util.List;

public class Servico {
    private int id;
    private String descricao;
    private double preco;

    // Lista de serviços
    private static List<Servico> servicos = new ArrayList<>();

    // Construtor
    public Servico(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para adicionar um serviço à lista de serviços
    public static void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    // Método para remover um serviço da lista de serviços
    public static void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    // Método para listar todos os serviços disponíveis
    public static List<Servico> listarServicos() {
        return servicos;
    }

    // Método toString para representação do serviço
    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
public class Item {
    private int id;
    private String descricao;

    // Construtor
    public Item(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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

    // Método toString para representação do item
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
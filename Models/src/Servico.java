public class Servico{
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    
}
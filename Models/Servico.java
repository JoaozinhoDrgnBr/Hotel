public class Servico{
    private string descricao;
    private double preco;

    public Servico(string descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setDescricao(string descricao){
        this.descricao = descricao;
    }

    public string getDescricao(){
        return this.descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    
}
public class Cliente{
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    

    public Cliente(String nome, String cpf, String telefone, String email, String endereco, String cidade, String estado, string cep, string pais){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void getDados(){
        return "Nome: " + this.nome + "CPF: " + this.cpf + "Telefone: " + this.telefone + "Email: " + this.email;
    }

    private void Cadastrar(){
        // cadastrar um cliente no sistema
    }
}
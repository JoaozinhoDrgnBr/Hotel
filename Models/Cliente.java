public class Cliente{
    private string nome;
    private string cpf;
    private string telefone;
    private string email;
    

    public Cliente(string nome, string cpf, string telefone, string email, string endereco, string cidade, string estado, string cep, string pais){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        
    }

    public void setNome(string nome){
        this.nome = nome;
    }

    public string getNome(){
        return this.nome;
    }

    public void setCpf(string cpf){
        this.cpf = cpf;
    }

    public string getCpf(){
        return this.cpf;
    }

    public void setTelefone(string telefone){
        this.telefone = telefone;
    }

    public string getTelefone(){
        return this.telefone;
    }

    public void setEmail(string email){
        this.email = email;
    }

    public string getEmail(){
        return this.email;
    }

    public getDados(){
        return "Nome: " + this.nome + "CPF: " + this.cpf + "Telefone: " + this.telefone + "Email: " + this.email;
    }

    private void Cadastrar(){
        // cadastrar um cliente no sistema
    }
}
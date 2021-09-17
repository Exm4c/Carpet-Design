public class Cliente {
    private String Nome;
    private String Sobrenome;
    private String CPF;
    
    public Cliente(String cpf, String nome, String sobrenome){
        this.Nome = nome;
        this.Sobrenome = sobrenome;
        this.CPF = cpf;
    }  
    
    public void atualizaCliente(String cpf, String nome, String sobrenome){
        this.CPF = cpf;
        this.Nome = nome;
        this.Sobrenome = sobrenome;
    }
    
    public Cliente(){}   
    
    public String getNome() {
        return Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }
 
    public String getCPF() {
        return CPF;
    }   
    
}

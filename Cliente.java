public class Cliente {

    //atributos
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;


    //constutor
    public Cliente(){
    }

    //construtor
    public Cliente(String nome){
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEndereco'");
    }

}

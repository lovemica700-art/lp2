package gerenciadorCursos;

public class Academicos {
    
    private String nome;
    private String matricula;
    private String curso;
    private String email;
    private String telefone;

    public Academicos(String curso, String email,String matricula, String nome, String telefone) {
        this.curso = curso;
        this.email = email;
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
     
}

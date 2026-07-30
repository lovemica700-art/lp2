package gerenciadorCursos;
public class Academicos {
    
    private String nome;
    private String turma;
    private String semestre;
    
    public Academicos(String nome, String turma, String semestre) {
        this.nome = nome;
        this.turma = turma;
        this.semestre = semestre;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

}

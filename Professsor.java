package gerenciadorCursos;
public class Professsor {

    private String nome;
    private String diciplina;
    private int semestre;

    public Professsor(){

    }

    
    public Professsor(String nome, String diciplina, int semestre) {
        this.nome = nome;
        this.diciplina = diciplina;
        this.semestre = semestre;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDiciplina() {
        return diciplina;
    }
    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }



}

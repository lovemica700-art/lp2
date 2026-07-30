package gerenciadorCursos;
public class Universidade {

    private String curso;
    private String diciplina;
    private int semestre;

    public Universidade() {
    }
        
    public Universidade(String cursos, String diciplina, int semestre) {
        this.curso = cursos;
        this.diciplina = diciplina;
        this.semestre = semestre;
    }

    public String getCursos() {
        return curso;
    }

    public void setCursos(String cursos) {
        this.curso = cursos;
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

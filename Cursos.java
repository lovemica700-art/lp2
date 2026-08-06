package gerenciadorCursos;

public class Cursos {
    
    private String nomeCurso;
    private String codigoCurso;
    private String descricaoCurso;

    public Cursos(String nomeCurso, String codigoCurso, String descricaoCurso) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.descricaoCurso = descricaoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }
}

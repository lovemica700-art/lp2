package sistemaIngresso;

public class Sessao {
    
    private String horarioSessao;
    private String dataSessao;
    private String idiomaSessao;

    public Sessao(String dataSessao, String horarioSessao, String idiomaSessao) {
        this.dataSessao = dataSessao;
        this.horarioSessao = horarioSessao;
        this.idiomaSessao = idiomaSessao;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }

    public String getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(String dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getIdiomaSessao() {
        return idiomaSessao;
    }

    public void setIdiomaSessao(String idiomaSessao) {
        this.idiomaSessao = idiomaSessao;
    }

    
}

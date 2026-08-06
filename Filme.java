package sistemaIngresso;

public class Filme {
    
    private String nomeFilme;
    private String duracaoFilme;
    private String classificacaoFilme;
    private String generoFilme;
    private String idiomaFilme;
    private String diretorFilme;
    private String elencoFilme;
    private String dataLancamentoFilme;
    private String faixaEtariaFilme;
    private Sessao sessaoFilme;

    public Filme(String classificacaoFilme, String dataLancamentoFilme, String diretorFilme, String duracaoFilme, String elencoFilme, String faixaEtariaFilme, String generoFilme, String idiomaFilme, String nomeFilme, Sessao sessaoFilme) {
        this.classificacaoFilme = classificacaoFilme;
        this.dataLancamentoFilme = dataLancamentoFilme;
        this.diretorFilme = diretorFilme;
        this.duracaoFilme = duracaoFilme;
        this.elencoFilme = elencoFilme;
        this.faixaEtariaFilme = faixaEtariaFilme;
        this.generoFilme = generoFilme;
        this.idiomaFilme = idiomaFilme;
        this.nomeFilme = nomeFilme;
        this.sessaoFilme = sessaoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(String duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public String getClassificacaoFilme() {
        return classificacaoFilme;
    }

    public void setClassificacaoFilme(String classificacaoFilme) {
        this.classificacaoFilme = classificacaoFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getIdiomaFilme() {
        return idiomaFilme;
    }

    public void setIdiomaFilme(String idiomaFilme) {
        this.idiomaFilme = idiomaFilme;
    }

    public String getDiretorFilme() {
        return diretorFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    public String getElencoFilme() {
        return elencoFilme;
    }

    public void setElencoFilme(String elencoFilme) {
        this.elencoFilme = elencoFilme;
    }

    public String getDataLancamentoFilme() {
        return dataLancamentoFilme;
    }

    public void setDataLancamentoFilme(String dataLancamentoFilme) {
        this.dataLancamentoFilme = dataLancamentoFilme;
    }

    public String getFaixaEtariaFilme() {
        return faixaEtariaFilme;
    }

    public void setFaixaEtariaFilme(String faixaEtariaFilme) {
        this.faixaEtariaFilme = faixaEtariaFilme;
    }

    public Sessao getSessaoFilme() {
        return sessaoFilme;
    }

    public void setSessaoFilme(Sessao sessaoFilme) {
        this.sessaoFilme = sessaoFilme;
    }
}

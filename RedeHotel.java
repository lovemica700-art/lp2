package sistReservaHoteis;

public class RedeHotel {
    
    private String nomeHotel;
    private String cnpjHotel;
    private String descricaoHotel;
    private String qtdAndares;
    private String qtdVagasEstacionamento;

    public RedeHotel(String nomeHotel, String cnpjHotel, String descricaoHotel, String qtdAndares, String qtdVagasEstacionamento) {
        this.nomeHotel = nomeHotel;
        this.cnpjHotel = cnpjHotel;
        this.descricaoHotel = descricaoHotel;
        this.qtdAndares = qtdAndares;
        this.qtdVagasEstacionamento = qtdVagasEstacionamento;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }
    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
    public String getCnpjHotel() {
        return cnpjHotel;
    }
    public void setCnpjHotel(String cnpjHotel) {
        this.cnpjHotel = cnpjHotel;
    }
    public String getDescricaoHotel() {
        return descricaoHotel;
    }
    public void setDescricaoHotel(String descricaoHotel) {
        this.descricaoHotel = descricaoHotel;
    }
    public String getQtdAndares() {
        return qtdAndares;
    }
    public void setQtdAndares(String qtdAndares) {
        this.qtdAndares = qtdAndares;
    }
    public String getQtdVagasEstacionamento() {
        return qtdVagasEstacionamento;
    }
    public void setQtdVagasEstacionamento(String qtdVagasEstacionamento) {
        this.qtdVagasEstacionamento = qtdVagasEstacionamento;
    }
    
    
}

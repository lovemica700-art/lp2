package modelo;

public class Endereco {

    //atributos

    private String rua;
    private String numero;
    private String complemeto;
    private String bairo;
    private String cidade;
    private String estado;
    private String pais;

    //construtores
    public Endereco() {

    }

    public Endereco(String rua, String numero, String complemeto, String bairo, String cidade, String estado,
        String pais) {
        this.rua = rua;
        this.numero = numero;
        this.complemeto = complemeto;
        this.bairo = bairo;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemeto() {
        return complemeto;
    }

    public void setComplemeto(String complemeto) {
        this.complemeto = complemeto;
    }

    public String getBairo() {
        return bairo;
    }

    public void setBairo(String bairo) {
        this.bairo = bairo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

   

}

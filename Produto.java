package sistemaInventario;

public class Produto {
    
    private String nomeProduto;
    private String codigoProduto;
    private String descricaoProduto;
    private String dataValidadeProduto;
    private String loteProduto;
    private String MarcaProduto;
    
    public Produto(String nomeProduto, String codigoProduto, String descricaoProduto, String dataValidadeProduto,
            String loteProduto, String marcaProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.dataValidadeProduto = dataValidadeProduto;
        this.loteProduto = loteProduto;
        MarcaProduto = marcaProduto;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public String getDataValidadeProduto() {
        return dataValidadeProduto;
    }
    public void setDataValidadeProduto(String dataValidadeProduto) {
        this.dataValidadeProduto = dataValidadeProduto;
    }
    public String getLoteProduto() {
        return loteProduto;
    }
    public void setLoteProduto(String loteProduto) {
        this.loteProduto = loteProduto;
    }
    public String getMarcaProduto() {
        return MarcaProduto;
    }
    public void setMarcaProduto(String marcaProduto) {
        MarcaProduto = marcaProduto;
    }


}

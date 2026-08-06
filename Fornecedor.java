package sistemaInventario;

public class Fornecedor {
    
    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String numeroFornecedor;

    public Fornecedor(String nomeFornecedor, String cnpjFornecedor, String numeroFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.numeroFornecedor = numeroFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getNumeroFornecedor() {
        return numeroFornecedor;
    }

    public void setNumeroFornecedor(String numeroFornecedor) {
        this.numeroFornecedor = numeroFornecedor;
    }
}

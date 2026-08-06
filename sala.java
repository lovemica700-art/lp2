package sistemaIngresso;

public class sala {
    
    private String qtdAssentos;
    private String qtdCadeiras;
    private String qtdSofas;
    
    public sala(String qtdAssentos, String qtdCadeiras, String qtdSofas) {
        this.qtdAssentos = qtdAssentos;
        this.qtdCadeiras = qtdCadeiras;
        this.qtdSofas = qtdSofas;
    }
    
    public String getQtdAssentos() {
        return qtdAssentos;
    }
    public void setQtdAssentos(String qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }
    public String getQtdCadeiras() {
        return qtdCadeiras;
    }
    public void setQtdCadeiras(String qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }
    public String getQtdSofas() {
        return qtdSofas;
    }
    public void setQtdSofas(String qtdSofas) {
        this.qtdSofas = qtdSofas;
    }
}

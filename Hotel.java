package sistReservaHoteis;

public class Hotel {
    
    private String qtdQuartos;
    private String qtdStardard;
    private String qtdLuxo;
    
    public Hotel(String qtdQuartos, String qtdStardard, String qtdLuxo) {
        this.qtdQuartos = qtdQuartos;
        this.qtdStardard = qtdStardard;
        this.qtdLuxo = qtdLuxo;
    }
    
    public String getQtdQuartos() {
        return qtdQuartos;
    }
    public void setQtdQuartos(String qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }
    public String getQtdStardard() {
        return qtdStardard;
    }
    public void setQtdStardard(String qtdStardard) {
        this.qtdStardard = qtdStardard;
    }
    public String getQtdLuxo() {
        return qtdLuxo;
    }
    public void setQtdLuxo(String qtdLuxo) {
        this.qtdLuxo = qtdLuxo;
    }



}

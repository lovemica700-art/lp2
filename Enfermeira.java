package sistemaHospital;

public class Enfermeira {
    
    private String nomeEnfermeira;
    private String administraMedicamento;
    private String numeroEnfermeira;
    private String horarioMedicamento;
   
    public Enfermeira(String nomeEnfermeira, String administraMedicamento, String numeroEnfermeira, String horarioMedicamento) {
        this.nomeEnfermeira = nomeEnfermeira;
        this.administraMedicamento = administraMedicamento;
        this.numeroEnfermeira = numeroEnfermeira;
        this.horarioMedicamento = horarioMedicamento;
    }

    public String getNomeEnfermeira() {
        return nomeEnfermeira;
    }

    public void setNomeEnfermeira(String nomeEnfermeira) {
        this.nomeEnfermeira = nomeEnfermeira;
    }

    public String getAdministraMedicamento() {
        return administraMedicamento;
    }

    public void setAdministraMedicamento(String administraMedicamento) {
        this.administraMedicamento = administraMedicamento;
    }

    public String getNumeroEnfermeira() {
        return numeroEnfermeira;
    }

    public void setNumeroEnfermeira(String numeroEnfermeira) {
        this.numeroEnfermeira = numeroEnfermeira;
    }

    public String getHorarioMedicamento() {
        return horarioMedicamento;
    }

    public void setHorarioMedicamento(String horarioMedicamento) {
        this.horarioMedicamento = horarioMedicamento;
    }
}

package sistemaHospital;

public class Paciente {
    
    private String nomePaciente;
    private String cpfPaciente;
    private String numeroResponsavel;
    private String nomeResponsavel;
    private String dataNascimento;
    private String sexo;

    public Paciente(String cpfPaciente, String dataNascimento,String nomePaciente, String nomeResponsavel, String numeroResponsavel, String sexo) {
        this.cpfPaciente = cpfPaciente;
        this.dataNascimento = dataNascimento;
        this.nomePaciente = nomePaciente;
        this.nomeResponsavel = nomeResponsavel;
        this.numeroResponsavel = numeroResponsavel;
        this.sexo = sexo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getNumeroResponsavel() {
        return numeroResponsavel;
    }

    public void setNumeroResponsavel(String numeroResponsavel) {
        this.numeroResponsavel = numeroResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    


}

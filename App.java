import modelo.Endereco;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Programação Orientada a Objetos");

        Pessoa p ; //declarando
        Endereco endereco;//declarando

        p = new Pessoa(null, null, null);

        p.setNome("Frederico Lima");
        p.setEmail("frederico@gmail.com");
        p.setCpf("4383309");

        endereco = new Endereco("Av das Pombas", "2020", "IFPR", "Floresta", "Casacavel", "PR","Brasil");
        p.setEndereco( endereco);




    }
}

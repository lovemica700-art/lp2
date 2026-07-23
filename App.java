public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cliente cliente = new Cliente();
        cliente.setNome ("Fulano de Tal");
        cliente.setCpf("88888888");
        System.out.println("Bom dia "+cliente.getNome());

        Cliente cliente1 = new Cliente( "Frederico Wanderley");
        System.out.println("Bom dia "+cliente1.getNome());

        cliente1.setTelefone("35445243");
        //Endereco endereco = new Endereco();
        cliente1.setEndereco(new Endereco("Av das Pombas", "2020", null, "Floresta",
        new Cidade()));

        cliente1.getEndereco().getCidade().setCidade("Cascavel");


        




    }
}

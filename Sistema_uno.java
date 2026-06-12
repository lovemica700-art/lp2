
import java.util.Scanner;
import java.util.Stack;

public class Sistema_uno {
    
    final static Scanner Mika = new Scanner(System.in);

    private static Stack<String> historico = new Stack<>();

     public static void main(String[] args) {
        int escolha;

        do {
            System.out.println("\n1 - Digitar texto");
            System.out.println("2 - Desfazer");
            System.out.println("3 - Mostrar histórico");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            escolha = Mika.nextInt();
            Mika.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um texto: ");
                    String texto = Mika.nextLine();
                    digitar(texto);
                    break;

                case 2:
                    desfazer();
                    break;

                case 3:
                    mostrarHistorico();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 0);
    }

    public static void digitar(String texto) {
        historico.push("Digitou: " + texto);
        System.out.println("Texto adicionado.");
    }

    public static void desfazer() {
        if (historico.isEmpty()) {
            System.out.println("Nada para desfazer!");
        } else {
            System.out.println("Desfeito: " + historico.pop());
        }
    }

    public static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }

        System.out.println("\n[TOPO]");
        for (int i = historico.size() - 1; i >= 0; i--) {
            System.out.println(historico.get(i));
        }
    }

   
}


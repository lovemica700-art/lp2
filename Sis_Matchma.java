
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sis_Matchma {

    final static  Scanner Mika = new Scanner(System.in);

    static Queue<String> fila = new LinkedList<>();

    public static void main(String[] args) {

        
        int escolhaK;

        do {

            System.out.println("\n1 - Entrar jogador");
            System.out.println("2 - Atender jogador");
            System.out.println("3 - Mostrar fila");
            System.out.println("4 - Tamanho da fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            escolhaK = Mika.nextInt();
            Mika.nextLine();

            switch (escolhaK) {

                case 1:
                    System.out.print("Nome do jogador: ");
                    String nome = Mika.nextLine();
                    entrarNaFila(nome);
                    break;

                case 2:
                    atenderJogador();
                    break;

                case 3:
                    mostrarFila();
                    break;

                case 4:
                    System.out.println("Jogadores aguardando: "
                            + tamanhoFila());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolhaK != 0);
    }

   
    public static void entrarNaFila(String nome) {
        fila.offer(nome);
        System.out.println(nome + " entrou na fila.");
    }

    public static void atenderJogador() {

        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Jogador atendido: " + fila.poll());
        }

    }

    public static void mostrarFila() {

        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.println("\n[FRENTE]");

        for (String jogador : fila) {
            System.out.println(jogador);
        }

        System.out.println("[FIM]");
    }

    public static int tamanhoFila() {
        return fila.size();
    }

    
}


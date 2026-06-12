
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Mini_Nav_Terminal {
    
    final static Scanner Mika = new Scanner(System.in);

    private static Stack<String> historico = new Stack<>();

    private static Queue<String> downloads = new LinkedList<>();

    public static void main(String[] args) {

        int escolhaA;

        do {
            System.out.println("\n===== MINI NAVEGADOR =====");
            System.out.println("1 - Abrir página");
            System.out.println("2 - Voltar página");
            System.out.println("3 - Mostrar histórico");
            System.out.println("4 - Adicionar download");
            System.out.println("5 - Processar download");
            System.out.println("6 - Mostrar downloads");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            escolhaA = Mika.nextInt();
            Mika.nextLine();

            switch (escolhaA) {

                case 1:
                    System.out.print("Digite a URL: ");
                    String url = Mika.nextLine();
                    abrirPagina(url);
                    break;

                case 2:
                    voltarPagina();
                    break;

                case 3:
                    mostrarHistorico();
                    break;

                case 4:
                    System.out.print("Nome do arquivo: ");
                    String arquivo = Mika.nextLine();
                    adicionarDownload(arquivo);
                    break;

                case 5:
                    processarDownload();
                    break;

                case 6:
                    mostrarDownloads();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolhaA != 0);
    }
       
    public static void abrirPagina(String url) {
        historico.push(url);
        System.out.println("Página aberta: " + url);
    }

    public static void voltarPagina() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma página para voltar.");
        } else {
            System.out.println("Voltando da página: " + historico.pop());
        }
    }

    public static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }

        System.out.println("\n=== HISTÓRICO ===");
        for (int i = historico.size() - 1; i >= 0; i--) {
            System.out.println(historico.get(i));
        }
    }

    public static void adicionarDownload(String arquivo) {
        downloads.offer(arquivo);
        System.out.println("Download adicionado: " + arquivo);
    }

    public static void processarDownload() {
        if (downloads.isEmpty()) {
            System.out.println("Nenhum download pendente.");
        } else {
            System.out.println("Processando: " + downloads.poll());
        }
    }

    public static void mostrarDownloads() {
        if (downloads.isEmpty()) {
            System.out.println("Nenhum download pendente.");
            return;
        }

        System.out.println("\n=== DOWNLOADS PENDENTES ===");
        for (String arquivo : downloads) {
            System.out.println(arquivo);
        }
    }

}

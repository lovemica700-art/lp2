
import java.util.Scanner;

public class Somando_elementos {
    final static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int [][] matriz = new int[7][6];

        int somaLinha = 0;

        int somaColuna = 0;

        System.out.println("Preencha a matriz 7X6 com apenas numeros inteiros: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
                
                //soma da linha
                if (i==4) {
                    somaLinha += matriz[i][j];
                }


                //soma da coluna
                if (j==2) {
                    somaColuna += matriz[i][j];
                }
            }
            
        }

        System.out.println("A soma do elemento que esta na linha 5 é: "+somaLinha);
        System.out.println(".....................................................");

        System.out.println();
        
        System.out.println("A soma do elemento que esta na coluna 3 é: "+somaColuna);
        System.out.println(".....................................................");
    }
}

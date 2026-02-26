import java.util.Scanner;

public class Soma_de_Pares_Matriz {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[][] matrizB = new int[9][9];
        int soma = 0;

        System.out.println("Preencha a matriz somente com númeeros inteiros!!");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                
                System.out.print("Elementos ["+i+"] ["+j+"]");
                matrizB[i][j] = ler.nextInt();

                if (matrizB[i][j] % 2 == 0) {
                    soma += matrizB[i][j];
                    
                }
            }
        }

        System.out.println("A soma dos nḿeros pares da matriz é: "+soma);
    }
}

import java.util.Scanner;

public class TrocanasMatrizes {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[][] matrizA = new int[10][10];

        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                
                System.out.print("Elementos ["+i+"] ["+j+"]");
                matrizA [i][j] = ler.nextInt();

            }
        }

        //troca da linha 2 com linha 8
        for (int j = 0; j < 10; j++) {
            int temp = matrizA[1][j];
            matrizA[1][j] = matrizA[7][j];
            temp = matrizA[7][j];
        }

        //troca de coluna 4 com coluna 10
        for (int i = 0; i < matrizA.length; i++) {
            int temp = matrizA[i][3];
            matrizA[i][3] = matrizA[i][9];
            temp = matrizA[i][9];
        }


        //troca da diagonal principal com a secundária
        for (int i = 0; i < matrizA.length; i++) {
            int temp = matrizA[i][i];
            matrizA[i][i] = matrizA[i][9-i];
            temp = matrizA[i][9-1];
            
        }


        // troca da linha 5 com a coluna 10
        for (int i = 0; i < matrizA.length; i++) {
            int temp = matrizA[4][i];
            matrizA[4][i] = matrizA[i][9];
            temp = matrizA[i][9];
            
        }

        // imprimindo matriz atualizada
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.printf("|%10d", matrizA[i][j]);
            }
            System.out.println(".....................................");
        }
    }

   
}

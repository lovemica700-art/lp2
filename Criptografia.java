
import java.util.Scanner;

public class Criptografia {
    
    final static Scanner MIKA = new Scanner(System.in);

    public static void main(String[] args) {

        StringBuilder resultado = new StringBuilder();
        
        String crip = MIKA.nextLine();

        if (crip == null || crip.trim().isEmpty()) return;
        
        int n = Integer.parseInt(crip.trim());

        for (int i = 0; i < n; i++) {
            String linha = MIKA.nextLine();

            if (linha == null) {
                break;
            }

            char[] chars = linha.toCharArray();
            int tamanho = chars.length;

            //deslocando as letras
            for (int j = 0; j < tamanho; j++) {
                
                char crips = chars[j];

                if ((crips >= 'a' & crips <= 'z')||(crips >= 'A' & crips <= 'Z')) {
                    chars[j] = (char) (crips + 3);
                }
            }

            //invertendo os caracteres

            int esquerda = 0;

            int direita = tamanho-1;

            if (esquerda < direita) {
                char temp = chars[esquerda];
                chars[esquerda] = chars[direita];
                chars[direita] = temp;
                esquerda++;
                direita--;
                
            }

            //deslocando os caracteres da metade em diante

            int metade = tamanho / 2;
            for (int j = metade; j < tamanho; j++) {
                chars[j] = (char) (chars[j] - 1);
            }


             System.out.println(new String(chars));
            
        }

        

    }
}

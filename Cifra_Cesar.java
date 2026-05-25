import java.util.Scanner;

public class Cifra_Cesar{

    final static Scanner MIKA = new Scanner(System.in);

    public static void main(String[] args) {

        //numero de casos de teste.
        int n = MIKA.nextInt();
        MIKA.nextLine();

        // //metodo e variavel que vai pegando as modificações em tempo real
        //     StringBuilder textoOriginal = new StringBuilder();

        //numero de casso de testes que serão testados
       for (int i = 0; i < n; i++) {

            //leitura e declaração das variaveis

            //a variavel que armazena o código que sera decifrado
            String cdg = MIKA.nextLine();
            
            //a quantidade de numeros de casas que deverão levar em conta prar decifrar o códio
            int qtdPosi= MIKA.nextInt();

            //limpar o buffer
            MIKA.nextLine();
            
            //metodo e variavel que vai pegando as modificações em tempo real
            StringBuilder textoOriginal = new StringBuilder();

            //este for vai lendo as incognitas ou seja lendo o código
            for (int k = 0; k < cdg.length(); k++){

                char cifra = cdg.charAt(k);

                int decifradoAscii = cifra - qtdPosi;

                if(decifradoAscii < 'A'){
                    decifradoAscii += 26;
                }

                textoOriginal.append((char) decifradoAscii);

                
            }

            System.out.println(textoOriginal.toString());

       }


        
    }
}
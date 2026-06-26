import java.util.Scanner;
/*  char cifra = cdg.charAt(k); */

public class Numero{

    final static Scanner Mika = new Scanner(System.in);

    public static void main(String[] args) {
        
        int test = Mika.nextInt();
        Mika.next();

        int resultado = 0;

        
       
       
        for (int i = 0; i < test; i++) {
            String palavra = Mika.nextLine();

             

            for (int j = 0; j < palavra.length(); j++) {

                char kmkkk = palavra.charAt(i);
               // int temp = palavra.charAt(i);
               // kmkkk = palavra.charAt(i);

                if (kmkkk == 'o'|| kmkkk == 'n'|| kmkkk == 'e') {
                    resultado = 1;
                }
                if (kmkkk == 't'|| kmkkk == 'w' || kmkkk =='o') {
                    resultado = 2;
                } 
                if(kmkkk == 't' || kmkkk == 'h' || kmkkk == 'r' || kmkkk == 'e' || kmkkk == 'e'){
                    resultado = 3;
                }

               

            } 
           

        }
         System.out.println(resultado);

         


        
    }
}
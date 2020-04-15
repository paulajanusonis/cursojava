import java.util.Scanner;
public class ex1074{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int N, valor;

        N = teclado.nextInt();
        for (int i=1; i <= N; i++) {
           valor = teclado.nextInt();

           if (valor == 0) {

               System.out.println("NULL");
           }
           else if (valor % 2 == 0){

                  if (valor>0) {

                      System.out.println("EVEN POSITIVE");
                  }
                  else System.out.println("EVEN NEGATIVE");
                 
              }
              else if (valor % 2 != 0) {

               if (valor > 0) {

                   System.out.println("ODD POSITIVE");
               }
              else System.out.println("ODD NEGATIVE");

           

        
           }

        }
        }
}


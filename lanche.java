import java.util.Scanner;
public class lanche{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        int codigo,quantidade;
        float total;

        total = 0;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

       switch(codigo){
           case 1:
                 total = quantidade * 4;
                 System.out.printf("Total: R$ %.2f\n",total);
           break;
           case 2:
           total = quantidade * 4.5f;
           System.out.printf("Total: R$ %.2f\n",total);
           break;
           case 3:
           total = quantidade * 5;
           System.out.printf("Total: R$ %.2f\n",total);
           break;  
           case 4:
           total = quantidade * 2;
           System.out.printf("Total: R$ %.2f\n",total);
           break;
           case 5:
           total = quantidade * 1.5f;
           System.out.printf("Total: R$ %.2f\n",total);

       }
                     


            
    }
}
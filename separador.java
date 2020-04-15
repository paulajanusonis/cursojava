import java.util.Scanner;
public class separador{
    public static void main(String args[]){


        Scanner teclado;
        teclado = new Scanner(System.in);
        int data; 
        int ano; 
        int dia; 
        int mes;

        /* entrada */
        System.out.println("Digite a data: ");
        data = teclado.nextInt();

        ano = data % 100;
        mes = (data / 100) % 100;
        dia = (data / 100) / 100;

        System.out.println("Ano"+ano);
        System.out.println("Mes"+mes);
        System.out.println("Dia"+dia);

    }
}

import java.util.Scanner;
public class ex1006{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        double A, B, C;
        double Media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        Media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", Media);
    }
    
    }
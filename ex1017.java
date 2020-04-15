import java.util.Scanner;
public class ex1017{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        int tempo, velocidade;
        double distancia, litros;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        
        distancia = velocidade * tempo; 
        litros = distancia / 12;
        System.out.printf("%.3f\n",litros);
    }
    
    }
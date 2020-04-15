import java.util.Scanner;
public class imposto{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        float salario, imposto;

        salario = teclado.nextFloat();

       

        
        if (salario<2000.00f){
            System.out.println("Isento");}

            else if (salario>2000.00f && salario<=3000.00f){
                   imposto = (salario - 2000.00f) * 0.08f;

            System.out.printf("R$ %.2f\n",imposto);}

            else if (salario>3000.00f && salario<=4500.00f){
                   imposto = ((salario - 3000.00f) * 0.18f) + 1000.00f * 0.08f;
              System.out.printf("R$ %.2f\n",imposto);}

                else if (salario>4500.00f){
                   imposto = (salario - 4500.00f) * 0.28f + (1000.00f * 0.08f) + 1500.00f * 0.18f;
                   System.out.printf("R$ %.2f\n",imposto);}

                }     

            }

        
    
    
    
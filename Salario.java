

import java.util.Scanner;
public class Salario{
    public static void main(String args[]){


        Scanner teclado;
        teclado = new Scanner(System.in);
        float salario;
        float imposto;
        float sal_liq;

        /* entrada */
        System.out.println("Por favor, digite o salário0");
        salario = teclado.nextFloat();


        /*processamento*/
        imposto = salario * 15 / 100;
        sal_liq = salario - imposto;

        /*saida*/
        System.out.println("Salário Bruto R$"+salario);
        System.out.println("Imposto R$"+imposto);
        System.out.println("Salário líquido é R$"+sal_liq);




    


    }





}
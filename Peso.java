import java.util.Scanner;
public class Peso{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        String sexo;
        float altura, peso;

        System.out.println("Digite o sexo");
        sexo = teclado.nextLine();
        System.out.println("Digite a altura");
        altura = teclado.nextFloat();

        if (sexo.equals("feminino")) {
           peso = (altura * 62.1f)-44.7f;
        }
        else{

            peso = (altura * 72.7f)-58;
        } 

        System.out.println("Seu peso ideal:"+peso);
    }
}
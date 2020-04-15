import java.util.Scanner;
public class eleitor{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
    
        int idade;
       

        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        
        if (idade<16){ 
          System.out.println("Não eleitor."); 
        
        
                if (idade>=18 && idade<=65) 
                  System.out.println("Obrigatorio votar!!!");
                
        }
                else
                         

                            System.out.println("Facultativo!");
        
                         
                  


                
            
         

        
    }
}
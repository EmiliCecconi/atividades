import java.util.*;

public class App 
{
    
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float valor,des,total;





         System.out.println("Digite o valor de um produto: ");
         valor = ler.nextFloat();

         System.out.println("Digite o desconto desse produto: ");
         des = ler.nextFloat();

         total = valor/100*des;

         total = valor - des;

     


         System.out.println("O valor do produto com desconto é: R$"+total);



    }
}

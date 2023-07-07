import java.util.*;
public class App 
{
    
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float valor,total;
        int quant;





         System.out.println(" Digite o valor de um produto: ");
         valor = ler.nextFloat();

          System.out.println(" Digite a quantidade desse produto que você comprou: ");
         quant = ler.nextInt();

         total = valor * quant;

         System.out.println("O valor total da compra é: R$"+total);




    }
}
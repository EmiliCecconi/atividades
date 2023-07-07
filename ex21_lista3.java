import java.util.*;
public class App 
{
    
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        
        double altu,peso,total;
        


         System.out.println(" Digite sua altura: ");
         altu = ler.nextDouble();

          System.out.println(" Digite seu peso: ");
         peso = ler.nextDouble();

         total = peso/ (altu * altu);


          System.out.println("Seu IMC é: "+total);






    }
}
import java.util.*;

public class App 
{
   


    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        int idade,mes,total;
       


         System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

         System.out.println("Digite quantos meses você viveu: ");
        mes = ler.nextInt();

        total = mes * 30;

         System.out.println("Você viveu cerca de: "+total+" dias");






    }
}
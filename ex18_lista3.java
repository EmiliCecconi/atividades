import java.util.*;

public class App 
{
   


    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        int idade,ano,total;
       


         System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

         System.out.println("Digite o ano em que estamos: ");
        ano = ler.nextInt();

        total = ano - idade;

         System.out.println("Você nasceu no ano de: "+total);






    }
}

import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner ler = new Scanner(System.in);
        int num=10;
        int numm=5;
        int maior,maiornumero;

        System.out.println("Digite número 1: ");
        num= ler.nextInt();
        System.out.println("Digite número 2: ");
        numm= ler.nextInt();


         if (num > numm)
         {
            maior=num;

         }
         else
         {
            maior=numm;

         }
          System.out.println("O maior é: "+maior);

         }





    }


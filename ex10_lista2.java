import java.util.*;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        int a,b,c;


        System.out.println("Digite um número inteiro: ");
        a = ler.nextInt();



        System.out.println("Digite outro número inteiro: ");
        b = ler.nextInt();

       c = a;
       a = b;
       b = c;

       System.out.println("primeiro valor é: "+a+", e o segundo é: "+b);



        

    }
}

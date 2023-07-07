import java.util.*;
import java.sql.SQLOutput;


public class App 
{
    public static void main(String[] args) 
    {
        Scanner Ler = new Scanner (System.in);
        int inteiro;
        Float decimal;
        

        System.out.println("Digite um número inteiro: ");
        inteiro = Ler.nextInt();
        
        System.out.println("Digite um número decimal: ");
        decimal = Ler.nextFloat();

        

        System.out.println("O número inteiro é: "+inteiro+", e o decimal é: "+decimal);


    }
}
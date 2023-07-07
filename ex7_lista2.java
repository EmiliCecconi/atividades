import java.util.*;
import java.sql.SQLOutput;


public class App 
{
    public static void main(String[] args) 
    {
        Scanner Ler = new Scanner (System.in);
        String nome;
        int idade;
        String cidade;

        System.out.println("Digite seu nome: ");
        nome = Ler.nextLine();
        
        System.out.println("Digite sua cidade: ");
        cidade = Ler.nextLine();

        System.out.println("Digite sua idade: ");
        idade = Ler.nextInt();

        System.out.println("Olá "+nome+", você tem "+idade+" anos e mora em "+cidade);


    }
}

import java.util.*;


public class App 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
       int numeroelevado,numeroraiz;
        double quadrado,raiz;



        System.out.println("Digite um número para ser elevado: ");
        numeroelevado = ler.nextInt();

        System.out.println("Digite um número para saber a raiz: ");
        numeroraiz = ler.nextInt();

        quadrado = Math.pow(numeroelevado, 2);

        raiz = Math.sqrt(numeroraiz);

        System.out.println("****************************************************");

       

         System.out.println(numeroelevado+" elevado ao quadrado é:"+ quadrado);

          System.out.println(raiz+" é a raiz de: "+numeroraiz);


        
    }
}
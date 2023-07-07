import java.util.*;


public class App 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float numero;
        double quadrado;



        System.out.println("Digite o raio de um círculo: ");
        numero = ler.nextFloat();

        quadrado = Math.pow(numero, 2);

        quadrado = quadrado * 3.14;

         System.out.println("A area do círculo é: "+ quadrado);







        
    }
}


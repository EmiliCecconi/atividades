import java.util.*;

public class App 
{
    //. Solicite ao usuário que digite um número inteiro e calcule
    // o quadrado desse número. Em seguida, mostre oresultado.
    
     
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        int num;
        double quadrado;


         System.out.println("Digite o número inteiro: ");
         num = ler.nextInt();

         quadrado = Math.pow(num,2);

          System.out.println("O número: "+num+" ao quadrado é: "+quadrado);



         

        
    }
}

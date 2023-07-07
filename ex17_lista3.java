import java.util.*;

public class App 
{
    //Solicite ao usuário que digite o valor de um produto e a quantidade de parcelas desejada. 
    //Calcule o valor de cada parcela. Em seguida, mostre o resultado.


    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float valor,par,total;



         System.out.println("Digite o valor de um produto: ");
         valor = ler.nextFloat();

         System.out.println("Digite o número de parcelas desse produto: ");
         par = ler.nextFloat();

         total = valor/par;
     


         System.out.println("O valor de cada parcela é: R$"+total);



    }
}

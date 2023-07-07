import java.util.*;

public class App 
{
    //Solicite ao usuário que digite o valor de um produto e aplique um desconto de 10%.
     //Calcule o valor com desconto e mostre o resultado.
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float valor,des,total;





         System.out.println("Digite o valor de um produto: ");
         valor = ler.nextFloat();

         des = valor/100 * 10;

         total = valor - 10;

         System.out.println("O valor do produto com desconto é: R$"+total);



    }
}


import java.util.*;

public class App 
{
    //Solicite ao usuário que digite o valor de um produto e aplique um acréscimo de 15%.
    // Calcule o valor com acréscimo e mostre o resultado
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float valor,acre,total;





         System.out.println("Digite o valor de um produto: ");
         valor = ler.nextFloat();

         acre = valor/100 * 15;

         total = valor + 15;

         System.out.println("O valor do produto com acréscimo é: R$"+total);



    }
}

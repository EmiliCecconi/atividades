import java.util.*;

public class App 
{
    //Solicite ao usuário que digite a quantidade de litros de combustível abastecidos
    // e o valor do litro. Calcule o valor total a ser pago. Em seguida, mostre o resultado.
     
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        float litros,valor,total;





         System.out.println("Digite a quantidade de litros abastecidos: ");
         litros = ler.nextFloat();

         System.out.println("Digite o valor do combustível por litro: ");
         valor = ler.nextFloat();

         total = valor * litros;

         System.out.println("O valor total a ser pago pelo combustível é: R$"+ total);


         

         



    }
}

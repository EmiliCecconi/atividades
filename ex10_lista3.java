import java.util.*;

public class App 
{
    //Solicite ao usuário que digite a quantidade de dias que um carro foi alugado e o valor da
     //diária. Calcule o valor total do aluguel. Em seguida, mostre o resultado.
     
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        int dia;
        float valor,total;


         System.out.println("Digite a quantidade de dias que o carro foi alugado: ");
         dia = ler.nextInt();

         System.out.println("Digite o valor da diária do carro: ");
         valor = ler.nextFloat();

         total = valor * dia;

         System.out.println("O valor total a ser pago pelo carro é: R$"+ total);


        
    }
}

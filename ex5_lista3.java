import java.util.*;


public class App 
{

    //Solicite ao usuário que digite a quantidade de horas trabalhadas
    // em um dia e o valor da sua hora de trabalho.Calcule o salário diário. Em seguida, mostre o resultado.
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);

        
        float preco,soma;
        int hora;


        System.out.println("Digite a quantidade de horas trabalhadas: ");
        hora = ler.nextInt();

        System.out.println("Digite o valor de cada hora trabalhada: ");
        preco = ler.nextFloat();

        soma = preco * hora;

        System.out.println("Você trabalhou "+hora+" horas por dia e ganhou R$"+soma+" nesse dia");





        

        



        

    }
}

import java.util.*;


public class App 
{

    //Solicite ao usuário que digite a base e a altura de um triângulo
    // e calcule a área do triângulo. Em seguida, mostre o resultado.
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        
        float base,altura,soma;


        System.out.println("Digite a altura de um triângulo: ");
        altura = ler.nextFloat();

         System.out.println("Digite a base de um triângulo: ");
         base = ler.nextFloat();

         soma = base * altura /2;

          System.out.println("A área desse triângulo é: "+ soma);




    }
}


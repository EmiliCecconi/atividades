import java.util.*;


public class App 
{

    //Solicite ao usuário que digite dois números inteiros e realize a
    // multiplicação entre eles. Em seguida, mostre o resultado.
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);

        int num,numm,mul;

         System.out.println("Digite um númro inteiro: ");
         num = ler.nextInt();

          System.out.println("Digite outro número inteiro: ");
          numm = ler.nextInt();

          mul = num * numm;

          System.out.println("A multiplicação de "+num+" X "+numm+" é: "+mul);





           


    }
}

import java.util.*;


public class App 
{

   
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        
            int lado,total;


        System.out.println("Digite o valor de um lado do quadrado: ");
        lado = ler.nextInt();

        total = lado * lado;

        System.out.println("A área desse quadrado é: "+total);



        




    }
}
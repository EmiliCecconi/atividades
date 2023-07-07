import java.util.*;

public class exer24_lista3
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        int valor;
        System.out.println("Digite o número da tabuada: ");
        valor = ler.nextInt();



        for(int i =0; i<11; i++)
        {
            System.out.println(valor+" X "+i+" = "+(valor*i));



        }
    }
}

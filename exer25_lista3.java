import java.util.*;
public class exer25_lista3 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        double valordolar,valorreal;




        System.out.println("Digite um valor em dólar para ser convertido para real: ");
        valordolar = ler.nextDouble();

        valorreal = (valordolar * 4.84);

        System.out.println("O valor US$"+valordolar+" em real é: R$"+ valorreal);


    }
}

import java.util.*;


public class App 
{

    //Solicite ao usuário que digite uma temperatura em graus Celsius
    // e converta para Fahrenheit. Em seguida,mostre o resultado
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);
        
        float gra,con;


        System.out.println("Digite a temperatura em GrausCelsius: ");
        gra = ler.nextFloat();

        con = gra*9/5+32;

        System.out.println("A temperatura "+gra+" GrausCelsius em Fahrenheit é: "+con);



        





    }
}

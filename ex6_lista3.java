import java.util.*;


public class App 
{

    //Solicite ao usuário que digite a quantidade de dias, horas, minutos e segundos. 
    //Calcule o total de segundos. Emseguida, mostre o resultado.
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner (System.in);

        int dia,hora,minutos,segundos,somadia;

         System.out.println("Digite a quantidade de dias trabalhados: ");
         dia = ler.nextInt();

          System.out.println("Digite a quantidade de horas trabalhadas: ");
          hora = ler.nextInt();

           System.out.println("Digite a quantidade de minutos trabalhados: ");
           minutos = ler.nextInt();

            System.out.println("Digite a quantidade de segundos trabalhados: ");
           segundos = ler.nextInt();

        
           somadia = segundos * dia;

            System.out.println("Você trabalhou um total de: "+somadia+" segundos");
           segundos = ler.nextInt();



    }
}

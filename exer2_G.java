import java.util.*;
public class exer2_G
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um ângulo: ");
        double ang = Ler.nextDouble();
        
        double sen = Math.sin(ang);
        double senRad = Math.toRadians(sen);

        System.out.println(" O seno em radianos é " + senRad);

    }
}
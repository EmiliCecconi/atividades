import java.util.*;
public class exer2_Hlistamath
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um ângulo: ");
        double ang = Ler.nextDouble();
        
        double cos = Math.cos(ang);
        double cosRad = Math.toRadians(cos);

        System.out.println(" O cosseno em radianos é " + cosRad);

    }
}
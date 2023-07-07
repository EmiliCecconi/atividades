import java.util.*;
public class exer4_A_listamath
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite o raio do círculo: ");
        double raio = Ler.nextDouble();
    
        double are = Math.PI * Math.pow(raio,2);

        System.out.println(" A área do círculo é " + are);
        

    }
}
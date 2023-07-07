import java.util.*;
public class exer3_B_listamath
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um valor: ");
        double va = Ler.nextDouble();
    
        double asen = Math.asin(va);

        System.out.println(" O arco do seno do valor " + va + " é " + asen);
        

    }
}
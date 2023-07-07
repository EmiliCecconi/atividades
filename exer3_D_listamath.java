import java.util.*;
public class exer3_D_listamath
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um valor: ");
        double va = Ler.nextDouble();
    
        double atg = Math.asin(va);

        System.out.println(" O arco da tangente do valor " + va + " é " + atg);
        

    }
}
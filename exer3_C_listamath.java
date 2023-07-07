import java.util.*;
public class exer3_C_listamath
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um valor: ");
        double va = Ler.nextDouble();
    
        double acos = Math.acos(va);

        System.out.println(" O arco do cosseno do valor " + va + " é " + acos);
        

    }
}
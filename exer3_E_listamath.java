import java.util.*;
public class exer3_E_listamath
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um valor: ");
        double va = Ler.nextDouble();
    
        double nat = Math.log(va);

        System.out.println(" O valor natural de " + va + " é " + nat);
        

    }
}
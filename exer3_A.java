import java.util.*;
public class exer3_A
 {
    public static void main(String[] args) throws Exception 
    {
        Scanner Ler = new Scanner (System.in);


        System.out.println(" Digite um valor: ");
        double va = Ler.nextDouble();
    
        double tg = Math.toRadians(Math.tan(va));

        System.out.println(" O valor " + va + " é " + tg);
        

    }
}
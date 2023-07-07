import java.util.*;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner Ler = new Scanner (System.in);
        String nome,nomerua,cidade,estado;
       int numero,cep,celular;
       
        Float cpf ;
        
        

        System.out.println("Digite seu nome: ");
        nome = Ler.nextLine();
        
        System.out.println("Digite o nome da sua rua: ");
        nomerua = Ler.nextLine();

        System.out.println("Digite seu estado: ");
        estado  = Ler.nextLine();

         System.out.println("Digite sua cidade: ");
        cidade = Ler.nextLine();


         System.out.println("Digite o número da casa: ");
        numero = Ler.nextInt();

        System.out.println("Digite o CEP: ");
        cep = Ler.nextInt();

        System.out.println("Digite seu CPF: ");
        cpf = Ler.nextFloat();

        System.out.println("Digite seu número de telefone: ");
        celular = Ler.nextInt();
        System.out.println("*****************************************");

         System.out.println("Nome: "+nome);
          System.out.println("Endereço: "+nomerua+", "+numero+", "+cep);
           System.out.println("Cidade: "+cidade);
            System.out.println("Estado: "+estado);
             System.out.println("Cpf: "+cpf);
              System.out.println("Número do celular: "+celular);


    

    }
}
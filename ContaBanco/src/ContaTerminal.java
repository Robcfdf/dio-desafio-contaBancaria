//TODO:Conhecer e importar a classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  
          
    //Exibir as mensagens para o usuário 
    //Obter pela mensagens para o nosso usuário
        System.out.println("Informe seus Dados ,depois aperte a tecla ENTER para o próximo campo");

        System.err.println("Informe seu Nome : ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o primeiro deposito da conta: ");
        float saldo = scanner.nextFloat();
        System.out.println("\n");
        

        // Exibir a mensagem conta criada
        System.out.println("\n / Olá " +  nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é [" + agencia + "] , conta [" + numero + "] e seu saldo R$:" + saldo +" já está disponível para saque\".");
        
        System.out.println("\n");
        
        System.out.println("Os dados da sua conta são:");
        System.out.println("---------------------------------");
        System.out.println("Nome:\t\t" + nomeCliente);
        System.out.println("Agência:\t" + agencia);
        System.out.println("Conta:\t\t" + numero);
        System.out.println("Saldo:\t\t" + saldo);


    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando objeto scanner para entrada de dados no terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();
        
        System.out.println("Agora o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo R$ ");
        double saldo = scanner.nextDouble();
        
        //Saída de informação no terminal dos dados digitados
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque. Obrigado por confiar em nosso serviço.");

    }
}

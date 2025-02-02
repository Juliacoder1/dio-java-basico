import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO conhecer e importar a classe scanner.
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibe as perguntas de abertura da conta para o usúario digitar.
        System.out.println("Digite o seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

       System.out.println("Digite o numero da agencia: ");
       String agencia = scanner.next();

       System.out.println("Digite o seu saldo: ");
       double saldo = scanner.nextDouble();

       // System.out.println("olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia  + " conta " +   numero + " e seu saldo " + saldo); //

        // Exibir a mensagem conta criada.
       System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo é R$ %.2f.", nomeCliente, agencia, numero, saldo));
    }
}

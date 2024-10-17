import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite a sua Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        String mensagem = String.format("""
                Olá %s, obrigado por criar uma conta em nosso banco,
                sua agência é %s, conta %d e seu saldo %f já está disponível para saque.
                """, nome, agencia, numeroConta, saldo);

        System.out.println(mensagem);
    }
}
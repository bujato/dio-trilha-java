import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicita o número da conta
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        // Solicitar a agencia do banco
        System.out.println("Digite a agência do banco:");
        String agenciaBanco = scanner.next();

        // Solicita o nome do titular da conta
        System.out.println("Digite o nome do titular da conta:");
        String nomeCliente = scanner.next();

        // Solicitar saldo para saque:
        System.out.println("Digite o saldo para saque:");
        double saldoConta = scanner.nextDouble();

        // Exibir as informações da conta
        if (numeroConta == 1234 && agenciaBanco.equals("123-4")) {
            System.out.println("Bem-vindo de volta, " + nomeCliente + "!E seu saldo " + saldoConta + " já está disponível para saque.");
        } else {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBanco + " conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao Sistema Bancário!\n");

        System.out.println("Por favor, informe o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Agora, informe o número de sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o seu primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o valor do seu depósito inicial? ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta +
                " e seu saldo R$ " + saldo +
                " já está disponível para saque.");
    }
}

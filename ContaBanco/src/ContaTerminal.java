import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao Sistema Bancário!\n");

        System.out.println("Por favor, informe o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora, informe o número de sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta);
    }
}

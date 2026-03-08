import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int conta;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Informe o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: R$ ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso" +
                " banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " +
                saldo + " já está disponível para saque.");


    }




}

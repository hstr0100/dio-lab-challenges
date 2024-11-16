package dio;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha após o número

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibir mensagem formatada com os dados capturados
        System.out.println("Olá " + nomeCliente
            + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia
            + ", conta " + numero
            + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

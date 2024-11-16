package dio;

import java.util.Scanner;

// hstr0100 is a little over-qualified for this.
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Exibir a mensagem da exceção
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o parametroUm é MAIOR que parametroDois
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        // Realizar o loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
 

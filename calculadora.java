import java.util.Scanner;

/**
 * Classe Calculadora
 * Calculadora simples para uso no terminal
 */
public class Calculadora {

    // Método principal
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("=== CALCULADORA ===");

        // Loop para permitir várias operações até o usuário sair
        do {
            // Solicita os números
            System.out.print("\nDigite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            // Exibe o menu
            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            double resultado;

            // Switch para escolher a operação
            switch (opcao) {
                case 1:
                    resultado = somar(numero1, numero2);
                    System.out.printf("Resultado: %.2f%n", resultado);
                    System.out.println("Operação realizada com sucesso!");
                    break;

                case 2:
                    resultado = subtrair(numero1, numero2);
                    System.out.printf("Resultado: %.2f%n", resultado);
                    System.out.println("Operação realizada com sucesso!");
                    break;

                case 3:
                    resultado = multiplicar(numero1, numero2);
                    System.out.printf("Resultado: %.2f%n", resultado);
                    System.out.println("Operação realizada com sucesso!");
                    break;

                case 4:
                    // Tratamento de erro de divisão por zero
                    try {
                        resultado = dividir(numero1, numero2);
                        System.out.printf("Resultado: %.2f%n", resultado);
                        System.out.println("Operação realizada com sucesso!");
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Encerrando a calculadora. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Método de soma
    public static double somar(double a, double b) {
        return a + b;
    }

    // Método de subtração
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Método de multiplicação
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método de divisão com tratamento de erro
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}

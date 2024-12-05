import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1: Adição");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt();

        if (operacao == 1) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (operacao == 2) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (operacao == 3) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (operacao == 4) {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Erro: Operação inválida.");
        }

        scanner.close();
    }
}

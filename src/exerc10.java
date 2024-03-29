import java.util.Scanner;

public class exerc10 {
//    10. (ExeRepeticao10) Escreva um algoritmo que receba um número inteiro positivo. Fazer a
//    multiplicação + a impressão do número recebido iniciando em 1 até chegar ao número
//    recebido (incluindo o número recebido). Parar o algoritmo quando o usuário digitar 0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número inteiro positivo (ou 0 para sair):");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Número 0 digitado. Encerrando o programa.");
                break;
            }

            if (number < 0) {
                System.out.println("Número negativo fornecido. Digite um número inteiro positivo.");
                continue;
            }

            System.out.println("Multiplicação do número " + number + " de 1 até " + number + ":");
            for (int i = 1; i <= number; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}

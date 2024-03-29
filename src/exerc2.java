import java.util.Scanner;

public class exerc2 {
//    2. (ExeRepeticao02) Crie um programa em Java que receba do usuário dois números inteiros
//    positivos A e B (e garantindo que A < B), encontre e imprima os números divisíveis por 5 no
//    intervalo de números entre A e B (incluindo A e B) e a soma dos números encontrados.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros positivos:");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA >= numB) {
            System.out.println("Entrada inválida o primeiro numero deve ser menor que o segundo.");
            return;
        }

        System.out.println("Números divisíveis por 5 entre " + numA + " e " + numB + " são:");
        int soma = 0;
        for (int i = numA; i <= numB; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                soma += i;
            }
        }
        System.out.println("\nA soma dos números divisíveis por 5 é: " + soma);
    }
}

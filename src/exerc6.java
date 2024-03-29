import java.util.Scanner;

public class exerc6 {
    //    6. (ExeRepeticao06) Escreva um programa em Java que receba um número e faça a tabuada
    //    desse número de 1 a 10. Parar o algoritmo quando o usuário digitar um número negativo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número (ou um número negativo para sair):");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo fornecido. Encerrando o programa...");
                break;
            }

            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}

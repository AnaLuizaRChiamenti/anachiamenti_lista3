import java.util.Scanner;

public class exerc1 {

//    1. (ExeRepeticao01) Crie um programa em Java que receba do usuário um número inteiro
//    positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número
//    digitado + o somatório dos pares e ímpares separadamente.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteito pósitivo: ");
        int number = ler.nextInt();

        int pairTotal = 0;
        int oddTotal = 0;
        int sumPair = 0;
        int sumOdd = 0;

        for (int i = 1; i <= number; i++)
        {
            if (i % 2 == 0) {
                pairTotal++;
                sumOdd += i;
            }
            else {
                oddTotal++;
                sumPair += i;
            }
        }

        System.out.println("total: ");
        System.out.println("números pares: " + pairTotal);
        System.out.println("números impares: " + oddTotal);
        System.out.println("suma dos pares: " + sumPair);
        System.out.println("suma dos impares: "+ sumOdd);
    }
}

import java.util.Scanner;

public class exerc4 {
    //    4. (ExeRepeticao04) Ler uma quantidade indeterminada de duplas de valores (2 valores de
    //cada vez). Escrever para cada dupla lida uma mensagem que indique se ela foi informada em
    //    ordem crescente ou decrescente. A repetição será encerrada ao ser fornecido valores iguais
    //    para os elementos da dupla.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite dois valores (ou valores iguais para sair):");
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();

            if (valor1 == valor2) {
                System.out.println("Valores iguais fornecidos. Encerrando o programa...");
                break;
            } else if (valor1 < valor2) {
                System.out.println("Os valores foram informados em ordem crescente.");
            } else {
                System.out.println("Os valores foram informados em ordem decrescente.");
            }
        }
    }
}

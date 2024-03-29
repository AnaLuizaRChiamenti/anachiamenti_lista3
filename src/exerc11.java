import java.util.Scanner;

public class exerc11 {
//    11. (ExeRepeticao11) Escrever um algoritmo que recebe repetidamente o sexo (M - Masculino
//     e F - Feminino) e a idade. Apresentar no final do algoritmo a média da idade dos homens e a
//    média da idade das mulheres. Parar o algoritmo quando for digitado um sexo diferente de M
//    ou F.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAgeMen = 0;
        int totalAgeWomen = 0;
        int countMen = 0;
        int countWomen = 0;

        while (true) {
            System.out.println("Digite o sexo (M - Masculino, F - Feminino) ou digite qualquer outra tecla para sair:");
            String gender = scanner.next().toUpperCase();

            if (!gender.equals("M") && !gender.equals("F")) {
                System.out.println("Sexo diferente de M ou F. Encerrando o programa...");
                break;
            }

            System.out.println("Digite a idade:");
            int age = scanner.nextInt();

            if (gender.equals("M")) {
                totalAgeMen += age;
                countMen++;
            } else {
                totalAgeWomen += age;
                countWomen++;
            }
        }

        if (countMen > 0) {
            double averageAgeMen = (double) totalAgeMen / countMen;
            System.out.println("Média de idade dos homens: " + averageAgeMen);
        } else {
            System.out.println("No men were registered.");
        }

        if (countWomen > 0) {
            double averageAgeWomen = (double) totalAgeWomen / countWomen;
            System.out.println("Média de idade das mulheres: " + averageAgeWomen);        }
        else {
            System.out.println("Nenhuma mulher foi registrada.");
        }
    }
}

import java.util.Scanner;

public class exerc3 {
//    3. (ExeRepeticao03) Crie um programa em Java que receba do usuário um número inteiro
//    positivo e determine se ele é um “número perfeito”. Um número perfeito é aquele que é igual
//    à soma dos seus divisores, do 1 até o “número -1” (ou seja, dos divisores pares, exceto dele
//    mesmo, pois 0 e 1 não são números perfeitos).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo inteiro:");
        int num = scanner.nextInt();

        int sumDiv = 0;

        for(int i = 1; i < num; i++){
            if(num % i == 0) {
                sumDiv += i;
            }
        }

        if(sumDiv == num){
            System.out.println(num + " é um número pefeito.");
        } else {
            System.out.println(num +  " não é um número pefeito.");
        }
    }
}

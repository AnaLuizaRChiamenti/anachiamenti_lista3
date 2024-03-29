public class exerc8 {
//    8. (ExeRepeticao08) Escreva um algoritmo para imprimir os 50 primeiros números primos
//    maiores que 100. Obs.: Número primo é aquele divisível somente por 1 e ele mesmo.

    public static void main(String[] args) {
        int counter = 0;
        int number = 101;

        System.out.println("Os primeiros números primos maiores que 100: ");

        while (counter < 50) {
            if (primeNumber(number)) {
                System.out.println(number);
                counter++;
            }
            number++;
        }
    }
    public static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

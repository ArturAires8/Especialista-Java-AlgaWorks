import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;

        } else if (numero == 2) {

        } else if (numero % 2 == 0) {
            ehPrimo = false;
        }
        if (ehPrimo && numero > 2) {
            for (int divisor = 3; divisor <= numero / 2; divisor += 2) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

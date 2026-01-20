import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        while (soma < 100) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("Soma total: " + soma);
    }
}

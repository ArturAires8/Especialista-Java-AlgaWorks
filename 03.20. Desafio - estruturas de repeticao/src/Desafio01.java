import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaNumeros = 0;
        int numeroDigitado;

        for (int i = 0; i < 10; ) {
            System.out.println("Digite um número (par):");
            numeroDigitado = scanner.nextInt();
            if (numeroDigitado % 2 == 0) {
                somaNumeros += numeroDigitado;
                i++;
            }
        }
        System.out.println("Soma dos números pares: " + somaNumeros);
    }
}

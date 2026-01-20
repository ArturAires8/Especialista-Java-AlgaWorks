import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean negativo = false;

        if (numero < 0) {
            negativo = true;
            numero = -numero;
        }
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            numero = numero / 10;

            invertido = invertido * 10 + ultimoDigito;
        }
        if (negativo) {
            invertido = -invertido;
            original = -original;
        }
        System.out.println("Número original: " + original);
        System.out.println("Número invertido: " + invertido);
    }
}





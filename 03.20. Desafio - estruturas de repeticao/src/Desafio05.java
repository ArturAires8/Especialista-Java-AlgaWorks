import java.util.Scanner;

public class Desafio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean digitarProximo = true;
        int somaNumerosPares = 0;
        int somaNumerosImpares = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaNumerosPares += numero;
            } else {
                somaNumerosImpares += numero;

            }
            System.out.print("Deseja digitar outro número ? ");
            digitarProximo = scanner.nextBoolean();
        } while (digitarProximo);

        System.out.println("Soma dos números pares: " + somaNumerosPares);
        System.out.println("Soma dos números ímpares: " + somaNumerosImpares);

    }

}

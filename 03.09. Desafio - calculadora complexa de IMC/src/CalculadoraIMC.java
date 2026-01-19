import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite M para mulheres ou H para homens: ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Resultado imc: %.2f%n ", imc);

        if (sexo == 'M') {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 25.8) {
                System.out.println("No peso ideal");
            } else if (imc <= 27.3) {
                System.out.println("Um pouco acima do peso");
            } else if (imc <= 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obesa");
            }
        }
        if (sexo == 'H') {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 26.4) {
                System.out.println("No peso ideal");
            } else if (imc <= 27.8) {
                System.out.println("Um pouco acima do peso");
            } else if (imc <= 31.1) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obesa");
            }

        }
        scanner.close();
    }

}

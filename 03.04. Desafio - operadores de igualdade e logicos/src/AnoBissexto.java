import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

    }
}

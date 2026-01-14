import java.util.Scanner;

public class DesafioEntradaDeDados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome funcionario: ");
        String nomeFuncionario = entrada.nextLine();

        System.out.print("Digite o valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite quantidade de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Digite o valor dos descontos: ");
        double valorDescontos = entrada.nextDouble();

        double valorTotalSemDesconto = valorHora * horasTrabalhadas;

        double valorTotalDevido = valorTotalSemDesconto - valorDescontos;

        System.out.println("----------------------------------------------------");

        System.out.printf("Folha de pagamento: %s%n", nomeFuncionario);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, valorTotalSemDesconto);
        System.out.printf("Descontos: R$ %.2f%n", valorDescontos);
        System.out.printf("Total devido: %.2f%n", valorTotalDevido);


    }
}

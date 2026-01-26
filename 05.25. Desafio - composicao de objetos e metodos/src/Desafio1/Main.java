package Desafio1;

public class Main {

    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salario = folhaPagamento.calcularSalario(160,20,20
                ,30);


        System.out.printf("Salário devido: %.2f%n", salario);


    }

}

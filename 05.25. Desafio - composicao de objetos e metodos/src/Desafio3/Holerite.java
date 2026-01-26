package Desafio3;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimirInforcoesOlerite() {
        System.out.println("Holerite");
        System.out.println("----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor total horas normais: R$ %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor total horas extras: R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("Adicional filhos: R$ %.2f%n", valorAdicionalFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }

}

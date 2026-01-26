package Desafio1;

public class FolhaPagamento {

    double calcularSalario(int quantidadeHorasNormais, int quantidadeHorasExtras,double valorHoraNormal,
                           double valorHorasExtra) {

        double salarioHorasNormais = quantidadeHorasNormais * valorHoraNormal;

        double salarioHorasExtras = quantidadeHorasExtras * valorHorasExtra;

        double salarioTotal = salarioHorasNormais + salarioHorasExtras;

        return salarioTotal;

    }

}

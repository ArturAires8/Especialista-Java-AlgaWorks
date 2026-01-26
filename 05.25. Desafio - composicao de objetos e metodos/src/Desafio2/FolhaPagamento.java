package Desafio2;

public class FolhaPagamento {

    double calcularSalario(int horasNormaisTrabalhadas, int horasExtrasTrabalhadas,
                           ContratoTrabalho contrato) {

        double valorHoraNormais = horasNormaisTrabalhadas * contrato.valorHoraNormal;
        double valorHoraExtras = horasExtrasTrabalhadas * contrato.valorHoraExtra;

        double valorTotalSalario = valorHoraNormais + valorHoraExtras;

        if (contrato.temAdicionalFilhos()) {
            valorTotalSalario *= 1.10;
        }
        return valorTotalSalario;

    }

}




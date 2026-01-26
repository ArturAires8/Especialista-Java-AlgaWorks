package Desafio3;

public class FolhaPagamento {

    Holerite calcularSalario(int horasNormaisTrabalhadas, int horasExtrasTrabalhadas,
                             ContratoTrabalho contrato) {

        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormaisTrabalhadas * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtrasTrabalhadas * contrato.valorHoraExtra;

        double subtotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.temAdicionalFilhos()) {
            holerite.valorAdicionalFilhos = subtotal * 0.10;
        }
        return holerite;

    }
}
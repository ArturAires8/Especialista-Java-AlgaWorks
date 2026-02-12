package Desafio01;

public class Calendario {

    static final String[] NOME_MESES = new String[]{
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"
    };

    static String obterNomeMeses(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            return "Mês inválido! Digite um número entre 1 e 12.";
        }
        return NOME_MESES[numeroMes - 1];
    }

}




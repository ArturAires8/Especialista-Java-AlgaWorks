public class CadastroPortaria {


    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante) {
        cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    // void cadastrar(Visitante,long)
    void cadastrar(final Visitante visitante, final long senha) {

    }


    // void cadastrar(Visitante, int)
    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);

    }


}

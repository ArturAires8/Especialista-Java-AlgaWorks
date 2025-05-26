public class ServicoDePrecificacao {
    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        double precoVendaCaulculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);

        precoVendaCaulculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCaulculado;

    }

}

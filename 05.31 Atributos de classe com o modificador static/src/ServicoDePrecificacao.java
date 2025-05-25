public class ServicoDePrecificacao {


    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        // poderia ter cálculos muito mais complexos aqui

        double precoVendaCaulculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        precoVendaCaulculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCaulculado;

    }


}

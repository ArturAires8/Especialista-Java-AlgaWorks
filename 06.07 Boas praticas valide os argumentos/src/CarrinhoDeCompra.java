import java.util.Objects;

public class CarrinhoDeCompra {

    Produto produto;
    int quantidadeItens;


    void adicionarItem(Produto produto, int quatidade) {
        Objects.requireNonNull(produto, "Produto deve ser informado");

        if (quatidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que 0 ");
        }

        System.out.printf("Produto: %s%n", produto.nome);

        //TODO implementar
    }

    void gerarPedido(Endereco enderecoEntrega) {
        Objects.requireNonNull(enderecoEntrega, "Endereço de entrega deve ser informado ");

        criarNovoPedido(enderecoEntrega);
    }


    void gerarPedido() {
        criarNovoPedido(null);
    }

    // metodo interno(vamos estudar sobre private em breve)
    private void criarNovoPedido(Endereco enderecoEntrega) {
        // TODO implementar
    }


}


public class Principal {
    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        carrinhoDeCompra.adicionarItem(produto, 4);

        Endereco endereco = new Endereco();
        endereco.logradouro = "Rua das Amoras";
        endereco.numero = "1000";
        endereco.bairro = "Centro";


        carrinhoDeCompra.gerarPedido();

        System.out.println("Pedido Gerado");

    }
}
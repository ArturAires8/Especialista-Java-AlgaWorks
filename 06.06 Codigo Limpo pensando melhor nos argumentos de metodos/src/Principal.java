
public class Principal {
    public static void main(String[] args) {

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        //    carrinhoDeCompra.adicionarItem("Água", 5, 4);


        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        carrinhoDeCompra.adicionarItem(produto, 4);

        //  produto.alterarStatus(true);

        produto.ativar();
        produto.inativar();


    }
}
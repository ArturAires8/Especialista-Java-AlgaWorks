package com.algaworks.financeiro;

import static com.algaworks.financeiro.ContaPagar.imprimirConta;

public class Principal {

    public static void main(String[] args) {

        Fornecedor imobiliaria = new Fornecedor("Zé Negócios Imobiliários");

        ContaPagar contaAluguel = new ContaPagar();
        contaAluguel.setDescricao("Aluguel do apartamento");
        contaAluguel.setValor(4500);
        contaAluguel.setDataVencimento("10/07/2022");
        contaAluguel.setFornecedor(imobiliaria);

        imprimirConta(contaAluguel);

        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        // Pagar a mesma conta novamente deve ser impedido
        // contaAluguel.pagar();

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);

        // Cancelar o pagamento de uma conta pendente deve ser impedido
        // contaAluguel.cancelarPagamento();
    }


}



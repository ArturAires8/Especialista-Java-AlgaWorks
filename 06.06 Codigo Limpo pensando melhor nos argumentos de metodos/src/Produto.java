public class Produto {

    String nome;
    double precoUnitario;
    boolean ativo;

    void alterarStatus(boolean ativo) {
        if (ativo) {
            System.out.printf("Ativado");
        } else {
            System.out.printf("Desativado");
        }

        this.ativo = ativo;

    }

    void ativar() {
        System.out.printf("Ativando");
        this.ativo = true;


    }

    void inativar() {
        System.out.printf("Desativando");
        this.ativo = false;

    }
}

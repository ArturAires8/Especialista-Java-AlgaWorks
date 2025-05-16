public class TesteInicializacao {


    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricaccao = 2021;
        meuCarro.proprietario.nome = "Maria";

        Pessoa proprietarioAntigo = meuCarro.proprietario;

        meuCarro.proprietario = new Pessoa();


        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricaccao);
        System.out.println(meuCarro.proprietario.nome);


    }


}


public class Principal {
    public static void main(String[] args) {


        Pessoa eu = new Pessoa();
        eu.nome = "Artur Aires";
        eu.cpf = "01709698195";
        eu.anoNascimento = 1994;

        Pessoa voce = new Pessoa();
        voce.nome = "Bartolomeu";
        voce.cpf = "01709698196";
        voce.anoNascimento = 2013;


        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;


//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Artur";
//        meuCarro.proprietario.cpf = "01709698195";
//        meuCarro.proprietario.anoNascimento = 1994;

        Carro seuCarro = new Carro();

        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;


        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();


//        System.out.println("Meu Carro");
//        System.out.println("-------------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.nome);
//
//
//        System.out.println();
//
//        System.out.println("Seu Carro");
//        System.out.println("-------------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietario: %s%n", seuCarro.proprietario.nome);

    }
}
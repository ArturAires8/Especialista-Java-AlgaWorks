public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.anoFabricaccao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();

        seuCarro.anoFabricaccao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";


        System.out.println("Meu Carro");
        System.out.println("-------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricaccao);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("-------------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricaccao);


    }
}
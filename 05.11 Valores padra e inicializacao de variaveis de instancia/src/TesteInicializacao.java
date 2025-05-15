public class TesteInicializacao {


    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricaccao = 2021;


        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricaccao);


    }

}

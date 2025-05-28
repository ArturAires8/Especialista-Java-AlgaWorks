public class Principal {

    public static void main(String[] args) {

        var novoVisitante = new Visitante();

        novoVisitante.nome = "Joao";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);

    }

}

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Bartolomeu";
        cachorro1.raca = "Sdr";
        cachorro1.sexo = "Macho";
        cachorro1.idade = 13;

        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "Susy";
        cachorro2.raca = "Pincher";
        cachorro2.sexo = "Fêmea";
        cachorro2.idade = 13;

        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Raça: %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %s%n", cachorro1.idade);

        System.out.println("----------------------------------------");

        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %s%n", cachorro2.idade);


    }
}

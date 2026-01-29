public class Main {

    public static void main(String[] args) {

        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(5.8);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(9.9);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do circulo: %.2f%n", areaCirculo);

    }
}

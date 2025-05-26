public class Principal {


    public static void main(String[] args) {

        double areaQuadrado = CalcularAreas.calcularAreaQuadrado(5.2);
        double areaCirculo = CalcularAreas.calcularAreaCirculo(10.5);

        System.out.printf("Area do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);


    }
}

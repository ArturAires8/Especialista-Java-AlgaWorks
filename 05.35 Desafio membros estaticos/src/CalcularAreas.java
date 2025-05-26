public class CalcularAreas {

    static final double PI = 3.14159265358979323846;

    public static double calcularAreaQuadrado(double mediaDoLado) {
        return mediaDoLado * mediaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalcularAreas.PI;
    }

}

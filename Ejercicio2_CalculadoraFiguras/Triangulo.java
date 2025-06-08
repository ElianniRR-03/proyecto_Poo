public class Triangulo extends Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.tipo = "Triángulo";
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

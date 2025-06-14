public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.tipo = "Rectángulo";
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

package calculadorafiguras;

public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0)
            throw new IllegalArgumentException("Base y altura deben ser positivas.");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = base * altura;
    }

    @Override
    public String toString() {
        return String.format("Rectángulo - Base: %.2f, Altura: %.2f, Área: %.2f", base, altura, area);
    }
}
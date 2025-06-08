package calculadorafiguras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        if (radio <= 0) throw new IllegalArgumentException("El radio debe ser positivo.");
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return String.format("Círculo - Radio: %.2f, Área: %.2f", radio, area);
    }
}

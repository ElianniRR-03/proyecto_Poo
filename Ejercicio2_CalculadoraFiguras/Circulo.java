public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
        this.tipo = "Círculo";
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

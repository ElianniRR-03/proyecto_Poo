public abstract class Figura {
    protected String tipo;

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularArea();
    public static class Decorador {
    public static void imprimirTitulo(String titulo) {
        System.out.println("============ " + titulo + " ============");
    }
}

}
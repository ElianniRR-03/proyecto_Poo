package calculadorafiguras;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraFiguras {

private static final ArrayList<Figura> historial = new ArrayList<>();
private static final Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    int opcion;
    do {
        Decorador.imprimirCabecera("MENÚ PRINCIPAL");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Ver historial");
        System.out.println("5. Ver estadísticas");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
        opcion = leerEntero();

        try {
            switch (opcion) {
                case 1 -> agregarCirculo();
                case 2 -> agregarRectangulo();
                case 3 -> agregarTriangulo();
                case 4 -> mostrarHistorial();
                case 5 -> mostrarEstadisticas();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    } while (opcion != 0);
}

private static void agregarCirculo() {
    System.out.print("Radio: ");
    double r = leerDouble();
    Circulo c = new Circulo(r);
    c.calcularArea();
    historial.add(c);
    System.out.println("Área: " + c.getArea());
}

private static void agregarRectangulo() {
    System.out.print("Base: ");
    double b = leerDouble();
    System.out.print("Altura: ");
    double h = leerDouble();
    Rectangulo r = new Rectangulo(b, h);
    r.calcularArea();
    historial.add(r);
    System.out.println("Área: " + r.getArea());
}

private static void agregarTriangulo() {
    System.out.print("Base: ");
    double b = leerDouble();
    System.out.print("Altura: ");
    double h = leerDouble();
    Triangulo t = new Triangulo(b, h);
    t.calcularArea();
    historial.add(t);
    System.out.println("Área: " + t.getArea());
}

private static void mostrarHistorial() {
    Decorador.imprimirCabecera("Historial de Cálculos");
    if (historial.isEmpty()) {
        System.out.println("No hay cálculos registrados.");
        return;
    }
    for (Figura f : historial) {
        System.out.println(f);
    }
}

private static void mostrarEstadisticas() {
    Decorador.imprimirCabecera("Estadísticas");
    if (historial.isEmpty()) {
        System.out.println("No hay datos.");
        return;
    }
    double total = 0;
    for (Figura f : historial) {
        total += f.getArea();
    }
    System.out.println("Total de figuras: " + historial.size());
    System.out.println("Promedio de áreas: " + (total / historial.size()));
}

private static int leerEntero() {
    while (true) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Entrada inválida. Ingresa un número entero: ");
        }
    }
}

private static double leerDouble() {
    while (true) {
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Entrada inválida. Ingresa un número decimal: ");
        }
    }
}

// Clase anidada estática
public static class Decorador {
    public static void imprimirCabecera(String titulo) {
        System.out.println("\n===== " + titulo + " =====");
    }

    public static void imprimirLinea() {
        System.out.println("============");
    }
}
}

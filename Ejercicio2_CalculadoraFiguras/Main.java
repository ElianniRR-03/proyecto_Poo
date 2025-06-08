import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> historial = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            Figura.Decorador.imprimirTitulo("Calculadora de Figuras");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Radio: ");
                    double radio = Double.parseDouble(sc.nextLine());
                    if (radio < 0) throw new IllegalArgumentException("Valor no puede ser negativo");
                    Circulo c = new Circulo(radio);
                    historial.add(c);
                    System.out.println("Área: " + c.calcularArea());
                    break;
                case 2:
                    System.out.print("Base: ");
                    double base = Double.parseDouble(sc.nextLine());
                    System.out.print("Altura: ");
                    double altura = Double.parseDouble(sc.nextLine());
                    if (base < 0 || altura < 0) throw new IllegalArgumentException("Valores no válidos");
                    Rectangulo r = new Rectangulo(base, altura);
                    historial.add(r);
                    System.out.println("Área: " + r.calcularArea());
                    break;
                case 3:
                    System.out.print("Base: ");
                    base = Double.parseDouble(sc.nextLine());
                    System.out.print("Altura: ");
                    altura = Double.parseDouble(sc.nextLine());
                    if (base < 0 || altura < 0) throw new IllegalArgumentException("Valores no válidos");
                    Triangulo t = new Triangulo(base, altura);
                    historial.add(t);
                    System.out.println("Área: " + t.calcularArea());
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        Figura.Decorador.imprimirTitulo("Historial y Estadísticas");
        double sumaAreas = 0;
        for (Figura f : historial) {
            System.out.println(f.getTipo() + " - Área: " + f.calcularArea());
            sumaAreas += f.calcularArea();
        }
        if (!historial.isEmpty()) {
            System.out.println("Total figuras: " + historial.size());
            System.out.println("Promedio de áreas: " + (sumaAreas / historial.size()));
        }
    }
}

package registroUsuario;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorUsuarios controlador = new ControladorUsuarios();

        Usuario.MostrarMensaje.mostrarMensaje();

        while (true) {
            try {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = Integer.parseInt(sc.nextLine()); 

                System.out.print("Ciudad: ");
                String ciudad = sc.nextLine();

                Usuario u = new Usuario(nombre, edad, ciudad);
                controlador.agregarUsuario(u);

                System.out.print("¿Agregar otro usuario? (si/no): ");
                if (!sc.nextLine().equalsIgnoreCase("si")) break;

            } catch (NumberFormatException e) {
                System.out.println("Edad inválida. Por favor ingresa un número.");
            }
        }

        // Estadísticas
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Total usuarios: " + controlador.totalUsuarios());
        System.out.println("Promedio edad: " + ControladorUsuarios.calcularPromedioEdad(controlador.getUsuarios()));
        System.out.println("Nombre más largo: " + controlador.nombreMasLargo());

        Usuario destacado = controlador.usuarioDestacado();
        if (destacado != null) {
            System.out.println("Usuario destacado: " + destacado.getNombre() + " de " + destacado.getCiudad());
        }

        sc.close();
    }

}

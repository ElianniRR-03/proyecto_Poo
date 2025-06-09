import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Edad: ");
                int edad = Integer.parseInt(sc.nextLine());
                if (edad < 0) throw new Exception("Edad no válida");
                System.out.print("Ciudad: ");
                String ciudad = sc.nextLine();

                usuarios.add(new Usuario(nombre, edad, ciudad));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("¿Agregar otro usuario? (s/n): ");
            continuar = sc.nextLine().equalsIgnoreCase("s");
        }

        ControladorUsuarios.Decorador.imprimirDecoracion();
        System.out.println("Total registrados: " + usuarios.size());
        System.out.printf("Promedio de edad: %.2f\n", ControladorUsuarios.calcularPromedioEdad(usuarios));

        String nombreLargo = "";
        for (Usuario u : usuarios) {
            if (u.getNombre().length() > nombreLargo.length()) {
                nombreLargo = u.getNombre();
            }
        }
        System.out.println("Nombre más largo: " + nombreLargo);

        Usuario destacado = ControladorUsuarios.usuarioDestacado(usuarios);
        if (destacado != null) {
            System.out.println("Usuario destacado: " + destacado.getNombre());
        }
        ControladorUsuarios.Decorador.imprimirDecoracion();
    }
}

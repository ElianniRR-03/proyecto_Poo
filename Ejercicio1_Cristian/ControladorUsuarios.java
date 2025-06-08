import java.util.ArrayList;
import java.util.Random;

public class ControladorUsuarios {
    public static double calcularPromedioEdad(ArrayList<Usuario> usuarios) {
        if (usuarios.isEmpty()) return 0;
        int suma = 0;
        for (Usuario u : usuarios) suma += u.getEdad();
        return (double) suma / usuarios.size();
    }

    public static Usuario buscarUsuario(ArrayList<Usuario> usuarios, String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) return u;
        }
        return null;
    }

    public static ArrayList<Usuario> buscarUsuarioPorCiudad(ArrayList<Usuario> usuarios, String ciudad) {
        ArrayList<Usuario> encontrados = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.getCiudad().equalsIgnoreCase(ciudad)) encontrados.add(u);
        }
        return encontrados;
    }

    public static Usuario usuarioDestacado(ArrayList<Usuario> usuarios) {
        if (usuarios.isEmpty()) return null;
        Random rand = new Random();
        int indice = rand.nextInt(usuarios.size());
        return usuarios.get(indice);
    }

    public static class Decorador {
        public static void imprimirDecoracion() {
            System.out.println("=======================================");
        }
    }
}

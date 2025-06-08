package registroUsuario;

import java.util.*;

public class ControladorUsuarios {
	
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public int totalUsuarios() {
        return usuarios.size();
    }

    public static double calcularPromedioEdad(List<Usuario> lista) {
        if (lista.isEmpty()) return 0;
        int suma = 0;
        for (Usuario u : lista) {
            suma += u.getEdad();
        }
        return (double) suma / lista.size();
    }

    // Sobrecarga para buscar por nombre o ciudad.
    public Usuario buscarUsuario(String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) return u;
        }
        return null;
    }

    public Usuario buscarUsuarioPorCiudad(String ciudad) {
        for (Usuario u : usuarios) {
            if (u.getCiudad().equalsIgnoreCase(ciudad)) return u;
        }
        return null;
    }

    public String nombreMasLargo() {
        String largo = "";
        for (Usuario u : usuarios) {
            if (u.getNombre().length() > largo.length()) {
                largo = u.getNombre();
            }
        }
        return largo;
    }

    public Usuario usuarioDestacado() {
        if (usuarios.isEmpty()) return null;
        int indice = (int) (Math.random() * usuarios.size()); 
        return usuarios.get(indice);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
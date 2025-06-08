package registroUsuario;

public class Usuario {
	
	

    	private String nombre;
    	private int edad;
	    private String ciudad;

	    public Usuario(String nombre, int edad, String ciudad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.ciudad = ciudad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    
	    public String getCiudad() {
	        return ciudad;
	    }
	    

	    public static class MostrarMensaje {
	        public static void mostrarMensaje() {
	            System.out.println("Bienvenidos al Sistema de Registros de Usuarios");
	        }
	    }
	


}

package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private int puntuacion;
    private static Protagonista protagonista;
    private static Usuario jugadorActual;

    public Usuario() {
    	
    }

    public Usuario(String nombre, String contraseña, String personaje) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.puntuacion = 0;
    }

    /*public static void verEstadisticas() {
        System.out.println("\nJugador: " + jugadorActual.getNombre());
        System.out.println("Personaje: " + protagonista.getPersonaje());
        System.out.println("Puntuación: " + jugadorActual.getPuntuacion());
        System.out.println("Vida actual: " + protagonista.getVida());
        System.out.println("Chakra actual: " + protagonista.getChakra());
        protagonista.getAtaques().forEach(a -> System.out.println(" - " + a.getNombre()));
    }*/
}
    
   

package main;

import java.util.Scanner;

import dao.ConexionBD;
import modelo.*;

public class Juego {
    private static Scanner scanner = new Scanner(System.in);
    private Usuario usuarioActual;
    private ConexionBD conexionBD;

    public static void main(String[] args) {
    	System.out.println("╔═════════════════════════════════════════════════════════╗");
		System.out.println("║        *BIENVENIDO A LA AVENTURA DEL MUNDO NARUTO*      ║");
		System.out.println("║                                                         ║");
		System.out.println("║                                                         ║");
		System.out.println("║          Desarrolladores: Roberto, Pablo y Luis         ║");
		System.out.println("╠═════════════════════════════════════════════════════════╣");
        menuPrincipal();
    }

    public static void menuPrincipal() { // Mandar los datos a la BD
        // Menú de login, registro e iniciar juego
    	System.out.println("\nINICIO:");
		System.out.println("1. Registrarse");
		System.out.println("2. Iniciar sesión");
		
		int opcion = scanner.nextInt();
		scanner.nextLine();
		switch (opcion) {
		case 1:
			registrarUsuario();
			break;
		case 2:
			iniciarSesion();
			break;
        }
    }

    public static void registrarUsuario() {
    	System.out.println("Nombre de usuario:");
    	System.out.println("Contraseña:");
    	System.out.println("Confirmar contraseña:");
    	
    	String registrarse = null;
    	if (registrarse == null) {
    		System.out.println("¡Te has registrado correctamente!");
    	}
        // Pide datos y llama a ConexionBD.insertarUsuario()
    }

    public static void iniciarSesion() { // Shinobi y 123456789
        // Verifica credenciales y guarda el usuario en usuarioActual
    	System.out.println("Nombre de usuario:");
    	System.out.println("Contraseña:");
    	
    	String registrarse = null;
    	//registrarse = scanner.nextLine();
    	if (registrarse == null) {
    		System.out.println("¡Has iniciado sesión correctamente!");
    		elegirProtagonista();
    	}
    }

    public static void mostrarTopJugadores() {
        // Imprime el top 3 de Jugadores con mejor puntuaciones
    }
    
    public static void elegirProtagonista() {
    	System.out.println("ELIGE UN PERSONAJE:");
		System.out.println("1. Naruto");
		System.out.println("2. Sasuke");
		System.out.println("3. Gaara");
		System.out.print("Opción: ");
		int eleccion = scanner.nextInt();
		switch (eleccion) {
		case 1:
			System.out.println("¡Has elegido a Naruto!");
			iniciarAventura();
			break;
		case 2:
			System.out.println("¡Has elegido a Sasuke!");
			iniciarAventura();
			break;

		case 3:
			System.out.println("¡Has elegido a Gaara!");
			iniciarAventura();
			break;
		
		}
    }
    
    public static void iniciarAventura() {
    	// Lógica principal del juego (batallas, enigmas, etc.) 
    	System.out.println("\nMENÚ PRINCIPAL");
		System.out.println("1. Comenzar juego");
		System.out.println("2. Ver estadísticas");
		System.out.println("3. Ver TOP 3 jugadores");
		System.out.println("4. Salir");
		
		Escenario menu = new Escenario();
		
		int opcion = scanner.nextInt();
		scanner.nextLine();
		switch (opcion) {
		case 1:
			menu.menuEscenario();
			break;
		case 2:
			/*Usuario.verEstadisticas();*/
			break;

		case 3:
			mostrarTopJugadores();
			break; // Se llama directameNte a la BD
		case 4:
			System.out.println("Saliendo del juego. ¡Gracias por jugar!");
		}
    }
    
}


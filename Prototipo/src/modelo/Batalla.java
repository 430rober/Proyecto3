package modelo;

import java.util.Random;
import java.util.Scanner;

public class Batalla {
    private Usuario jugador;
    private Enemigo enemigo;
    private Scanner scanner;
    private Condiciones condiciones;

    public Batalla(Usuario jugador, Enemigo enemigo, Scanner scanner, Condiciones condiciones) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.scanner = scanner;
        this.condiciones = condiciones;
    }

    public boolean iniciar() {
        Random rand = new Random();
        System.out.println(condiciones);
        int penalizacionAtaque = condiciones.obtenerPenalizacionAtaque();
        int penalizacionDefensa = condiciones.obtenerPenalizacionDefensa();

        while (jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println("Elige un ataque:");
            for (int i = 0; i < jugador.getAtaques().size(); i++) {
                Ataque a = jugador.getAtaques().get(i);
                System.out.printf("%d. %s (Daño: %d, Chakra: %d)\n", i + 1, a.getNombre(), a.getDaño(), a.getChakra());
            }
            int opcion = scanner.nextInt() - 1;
            Ataque ataqueJugador = jugador.getAtaques().get(opcion);

            if (jugador.getChakra() >= ataqueJugador.getChakra()) {
                jugador.reducirChakra(ataqueJugador.getChakra());
                int dañoReal = Math.max(0, ataqueJugador.getDaño() - penalizacionAtaque);
                enemigo.recibirDaño(dañoReal);
                System.out.println("Daño infligido a " + enemigo.getNombre() + ": " + dañoReal);
            } else {
                System.out.println("No tienes suficiente chakra.");
                continue;
            }

            if (!enemigo.estaVivo()) break;

            Ataque ataqueEnemigo = enemigo.getAtaques().get(rand.nextInt(enemigo.getAtaques().size()));
            int dañoEnemigo = Math.max(0, ataqueEnemigo.getDaño() - penalizacionDefensa);
            jugador.recibirDaño(dañoEnemigo);
            System.out.println(enemigo.getNombre() + " ataca con " + ataqueEnemigo.getNombre() + " y causa " + dañoEnemigo);
            System.out.println("Vida restante de " + jugador.getNombre() + ": " + jugador.getVida());
        }

        return jugador.estaVivo();
    }
}

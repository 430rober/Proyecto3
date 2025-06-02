package main;

import java.util.*;

import modelo.*;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        System.out.println("==== Bienvenido al Juego de Naruto ====");
        System.out.println("1. Comenzar juego");
        System.out.println("2. Salir");
        String opcionMenu = scanner.nextLine();
        if (!opcionMenu.equals("1")) {
            System.out.println("Has salido del juego. Hasta pronto.");
            return;
        }

        // Contraseña
        System.out.println("Introduce la contraseña para comenzar:");
        while (!scanner.nextLine().equals("jugones")) {
            System.out.println("Contraseña incorrecta, intenta de nuevo:");
        }

        // Selección de personaje
        System.out.println("Elige tu personaje: Naruto, Sasuke o Gaara");
        Usuario jugador = null;
        String eleccion = scanner.nextLine();

        if (eleccion.equalsIgnoreCase("Naruto")) {
            jugador = new Usuario("Naruto", 160, 2300);
            jugador.añadirAtaque(new Ataque("Rasengan", 50, 275));
            jugador.añadirAtaque(new Ataque("Rasenshuriken", 120, 550));
            jugador.añadirAtaque(new Ataque("Clones de Sombra", 30, 100));
        } else if (eleccion.equalsIgnoreCase("Sasuke")) {
            jugador = new Usuario("Sasuke", 150, 1900);
            jugador.añadirAtaque(new Ataque("Chidori", 60, 300));
            jugador.añadirAtaque(new Ataque("Susano", 130, 750));
            jugador.añadirAtaque(new Ataque("Amateratsu", 100, 400));
        } else if (eleccion.equalsIgnoreCase("Gaara")) {
            jugador = new Usuario("Gaara", 120, 1400);
            jugador.añadirAtaque(new Ataque("Ataúd de Arena", 40, 300));
            jugador.añadirAtaque(new Ataque("Funeral de Arena", 90, 500));
            jugador.añadirAtaque(new Ataque("Balas de Arena", 60, 100));
        } else {
            System.out.println("Personaje no válido. Fin del juego.");
            return;
        }

        // Crear escenarios
        List<Escenario> escenarios = new ArrayList<>();

        Enemigo zabuza = new Enemigo("Zabuza", 80, 1000);
        zabuza.añadirAtaque(new Ataque("Manto de niebla", 50, 150));
        zabuza.añadirAtaque(new Ataque("Gran espada", 80, 300));
        zabuza.añadirAtaque(new Ataque("Técnicas de agua", 70, 250));
        escenarios.add(new Escenario("Cueva de la Niebla Oscura",
            "Un lugar lleno de trampas e ilusiones.", "Kakashi", zabuza,
            new Enigma("Me gusta chapotear, vivo en un estanque y soy buen nadador. ¿Qué soy?", "Rana"),
            new Artefacto("Luz de Zabuza"),
            "Kakashi: Las trampas aquí son como las de Obito. Necesitamos coordinación."));

        Enemigo orochimaru = new Enemigo("Orochimaru", 100, 1100);
        orochimaru.añadirAtaque(new Ataque("Kusanagi", 70, 200));
        orochimaru.añadirAtaque(new Ataque("Manto de serpiente", 95, 300));
        orochimaru.añadirAtaque(new Ataque("Invocación", 50, 250));
        escenarios.add(new Escenario("Laboratorio Perdido",
            "Un laboratorio retorcido de Orochimaru.", "Tsunade", orochimaru,
            new Enigma("Oro parece, plata no es. ¿Qué es?", "Platano"),
            new Artefacto("Amuleto de Escamas"),
            "Tsunade: Estos venenos no son normales. Decide cómo avanzar."));

        Enemigo itachi = new Enemigo("Itachi", 120, 1300);
        itachi.añadirAtaque(new Ataque("Genjutsu", 60, 200));
        itachi.añadirAtaque(new Ataque("Tsukuyomi", 100, 400));
        escenarios.add(new Escenario("Templo del Tiempo",
            "Ruinas donde el tiempo se distorsiona.", "Shikamaru", itachi,
            new Enigma("Vuelo sin alas, lloro sin ojos. ¿Qué soy?", "Nube"),
            new Artefacto("Esfera Temporal"),
            "Shikamaru: Aquí el tiempo no fluye normal. Prepárate bien."));

        Enemigo deidara = new Enemigo("Deidara", 130, 1250);
        deidara.añadirAtaque(new Ataque("Arte explosivo", 80, 300));
        escenarios.add(new Escenario("Bosque Explosivo",
            "Un bosque con trampas explosivas.", "Sai", deidara,
            new Enigma("Me rompo con una palabra. ¿Qué soy?", "Silencio"),
            new Artefacto("Tinta de Sai"),
            "Sai: Las trampas aquí son sensibles al sonido. Se cuidadoso."));

        Enemigo hidan = new Enemigo("Hidan", 150, 1400);
        hidan.añadirAtaque(new Ataque("Ritual sangriento", 90, 400));
        escenarios.add(new Escenario("Cripta Maldita",
            "Templo oscuro con energía maldita.", "Neji", hidan,
            new Enigma("Sin alas, sin motor, pero puedo volar. ¿Qué soy?", "Imaginacion"),
            new Artefacto("Talisman de Hidan"),
            "Neji: Su chakra está distorsionado. Usa tu visión interior."));

        Enemigo madara = new Enemigo("Madara", 180, 1600);
        madara.añadirAtaque(new Ataque("Meteorito", 120, 500));
        madara.añadirAtaque(new Ataque("Susano perfecto", 140, 600));
        escenarios.add(new Escenario("Palacio Celestial",
            "Fortaleza en el cielo controlada por Madara.", "Minato", madara,
            new Enigma("Más alto que un árbol, más pequeño que una hormiga. ¿Qué soy?", "Estrella"),
            new Artefacto("Llama Divina"),
            "Minato: Él controla los cielos. Solo tu voluntad puede derrotarlo."));

        while (true) {
            System.out.println("\n==== Elige una ubicación para explorar ====");
            int index = 1;
            for (Escenario esc : escenarios) {
                System.out.println(index + ". " + esc.getNombre() + (esc.isCompletado() ? " [COMPLETADO]" : ""));
                index++;
            }
            System.out.println("0. Salir del juego");
            int seleccion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (seleccion == 0) break;
            if (seleccion < 1 || seleccion > escenarios.size()) {
                System.out.println("Ubicación inválida.");
                continue;
            }

            Escenario esc = escenarios.get(seleccion - 1);
            if (esc.isCompletado()) {
                System.out.println("Ya has completado esta ubicación.");
                continue;
            }

            System.out.println("\nHas entrado en: " + esc.getNombre());
            System.out.println(esc.getDescripcion());
            System.out.println("Aliado: " + esc.getAliado());
            System.out.println(esc.getConversacion());

            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Combatir contra " + esc.getEnemigo().getNombre());
            System.out.println("2. Resolver enigma (el aliado distraerá al enemigo)");
            System.out.println("3. Pedir ayuda del aliado para ganar automáticamente");

            int opcionAccion = scanner.nextInt();
            scanner.nextLine();

            if (opcionAccion == 2) {
                System.out.println("Enigma: " + esc.getEnigma().getPregunta());
                String respuesta = scanner.nextLine();
                if (esc.getEnigma().comprobarRespuesta(respuesta)) {
                    System.out.println("¡Correcto! Has ganado gracias a tu astucia mientras tu aliado distraía al enemigo.");
                    jugador.añadirArtefacto(esc.getArtefacto());
                    esc.marcarCompletado();
                    continue;
                } else {
                    System.out.println("Respuesta incorrecta. El enemigo se ha dado cuenta y debes combatir.");
                }
            } else if (opcionAccion == 3) {
                System.out.println("Tu aliado " + esc.getAliado() + " ha intervenido directamente. Has ganado el combate.");
                jugador.añadirArtefacto(esc.getArtefacto());
                esc.marcarCompletado();
                continue;
            }

            // Generar condiciones aleatorias
            Random rand = new Random();
            Condiciones.Atmosfera atmosfera = Condiciones.Atmosfera.values()[rand.nextInt(Condiciones.Atmosfera.values().length)];
            Condiciones.MomentoDia momento = Condiciones.MomentoDia.values()[rand.nextInt(Condiciones.MomentoDia.values().length)];
            Condiciones.Terreno terreno = Condiciones.Terreno.values()[rand.nextInt(Condiciones.Terreno.values().length)];
            Condiciones condiciones = new Condiciones(atmosfera, momento, terreno);

            System.out.println("Condiciones del escenario:");
            System.out.println(" - Atmosfera: " + atmosfera);
            System.out.println(" - Momento del día: " + momento);
            System.out.println(" - Terreno: " + terreno);

            Batalla combate = new Batalla(jugador, esc.getEnemigo(), scanner, condiciones);
            boolean victoria = combate.iniciar();

            if (victoria) {
                System.out.println("¡Has vencido a " + esc.getEnemigo().getNombre() + " y obtenido el artefacto!");
                jugador.añadirArtefacto(esc.getArtefacto());
                esc.marcarCompletado();
            } else {
                System.out.println("Has sido derrotado. Fin del juego.");
                break;
            }
        }


        System.out.println("==== Fin del Juego ====");
        // Evaluar final personalizado
        int totalArtefactos = jugador.getArtefactos().size();
        String nombre = jugador.getNombre();
        System.out.println("==== Final Personalizado para " + nombre + " ====");

        if (nombre.equals("Naruto")) {
            switch (totalArtefactos) {
                case 6:
                    System.out.println("Naruto se convierte en el Hokage Supremo, protector de todas las aldeas.");
                    break;
                case 5:
                    System.out.println("Naruto restablece la paz en Konoha, pero siente que aún hay más por hacer.");
                    break;
                case 4:
                    System.out.println("Naruto regresa como héroe, aunque con cicatrices de batalla.");
                    break;
                case 2:
                case 3:
                    System.out.println("Naruto logra sobrevivir, pero el mundo sigue en conflicto.");
                    break;
                default:
                    System.out.println("Naruto cae en la batalla. Su espíritu queda como leyenda.");
            }
        } else if (nombre.equals("Sasuke")) {
            switch (totalArtefactos) {
                case 6:
                    System.out.println("Sasuke se redime completamente y funda una nueva era shinobi.");
                    break;
                case 5:
                    System.out.println("Sasuke derrota a sus enemigos y protege desde las sombras.");
                    break;
                case 4:
                    System.out.println("Sasuke cumple su misión, pero no logra liberarse de su pasado.");
                    break;
                case 2:
                case 3:
                    System.out.println("Sasuke sobrevive, pero duda de su camino y se aísla.");
                    break;
                default:
                    System.out.println("Sasuke cae intentando vengar a su clan. Una tragedia final.");
            }
        } else if (nombre.equals("Gaara")) {
            switch (totalArtefactos) {
                case 6:
                    System.out.println("Gaara se convierte en el Kazekage más poderoso de la historia.");
                    break;
                case 5:
                    System.out.println("Gaara protege su aldea y mantiene la armonía.");
                    break;
                case 4:
                    System.out.println("Gaara triunfa, aunque queda marcado por el combate.");
                    break;
                case 2:
                case 3:
                    System.out.println("Gaara salva la arena, pero sufre grandes pérdidas.");
                    break;
                default:
                    System.out.println("Gaara es vencido. El viento del desierto llora su caída.");
            }
        }

        System.out.println("Artefactos obtenidos:");
        for (Artefacto a : jugador.getArtefactos()) {
            System.out.println("- " + a.getNombre());
        }

        scanner.close();
    }
}

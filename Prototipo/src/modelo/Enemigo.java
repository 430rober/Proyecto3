package modelo;

public class Enemigo extends Protagonista {
    public Enemigo(String nombre, int vida, int chakra) {
        super(nombre, vida, chakra);
    }

    public void añadirAtaque(Ataque a) {
        ataques.add(a);
    }
}
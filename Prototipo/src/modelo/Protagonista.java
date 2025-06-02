package modelo;

import java.util.ArrayList;

public abstract class Protagonista {
    protected String nombre;
    protected int vida;
    protected int chakra;
    protected ArrayList<Ataque> ataques = new ArrayList<>();

    public Protagonista(String nombre, int vida, int chakra) {
        this.nombre = nombre;
        this.vida = vida;
        this.chakra = chakra;
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) vida = 0;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void reducirChakra(int cantidad) {
        chakra -= cantidad;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getChakra() { return chakra; }
    public ArrayList<Ataque> getAtaques() { return ataques; }
    public void recibirBonificacion(int bonificacion) { vida += bonificacion; }
}

package modelo;

public class Ataque {
    private String nombre;
    private int daño;
    private int chakra;

    public Ataque(String nombre, int daño, int chakra) {
        this.nombre = nombre;
        this.daño = daño;
        this.chakra = chakra;
    }

    public String getNombre() { return nombre; }
    public int getDaño() { return daño; }
    public int getChakra() { return chakra; }
}
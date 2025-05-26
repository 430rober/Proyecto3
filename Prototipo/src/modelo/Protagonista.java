package modelo;

import java.util.List;

public class Protagonista {
    private String nombre;
    private int puntosVida;
    private List<Artefacto> inventario;
    private List<Enigma> enigmasResueltos;

    public void luchar(Batalla batalla) {
        // Ejecuta batalla y aplica consecuencias
    }

    public void resolverEnigma(Enigma enigma) {
        // Llama a enigma.resolver() y añade puntos si acierta
    }

    public void añadirObjeto(Artefacto a) {
        inventario.add(a);
    }

    public List<Artefacto> getInventario() { return inventario; }
    public int getPuntosVida() { return puntosVida; }
    public String getNombre() { return nombre; }
}

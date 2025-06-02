package modelo;

import java.util.ArrayList;

public class Usuario extends Protagonista {
    private ArrayList<Artefacto> artefactos = new ArrayList<>();

    public Usuario(String nombre, int vida, int chakra) {
        super(nombre, vida, chakra);
    }

    public void añadirAtaque(Ataque a) {
        ataques.add(a);
    }

    public void añadirArtefacto(Artefacto a) {
        artefactos.add(a);
    }

    public ArrayList<Artefacto> getArtefactos() {
        return artefactos;
    }
}
    
   

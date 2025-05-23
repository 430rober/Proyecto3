package modelo;


import java.util.List;
import java.util.Scanner;

public class Enigma {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean recompensaArtefacto;
    private int puntos;

    public Enigma() {}
    
    public Enigma(int id, String nombre, String descripcion, boolean recompensaArtefacto, int puntos) {
    	this.id = id;
    	this.nombre = nombre;
        this.descripcion = descripcion;
        this.recompensaArtefacto = recompensaArtefacto;
        this.puntos = puntos;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isRecompensaArtefacto() {
		return recompensaArtefacto;
	}

	public void setRecompensaArtefacto(boolean recompensaArtefacto) {
		this.recompensaArtefacto = recompensaArtefacto;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	

	private static void resolverEnigma(Enigma enigma) {
	    System.out.println("\nEnigma: " + enigma.getDescripcion());
	    System.out.print("Tu respuesta: ");
	    String respuesta;
	}

}
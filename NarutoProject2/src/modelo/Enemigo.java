package modelo;

import java.util.List;

public class Enemigo {
    private int id;
    private String nombre;
    private String especie;
    private int vida;
    private int chakra;
    private List<Ataque> ataques;

    public Enemigo() {}

    public Enemigo(int id, String especie, String nombre, int vida, int chakra) {
    	this.id = id;
    	this.especie = especie;
        this.nombre = nombre;
        this.vida = vida;
        this.chakra = chakra;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getChakra() {
		return chakra;
	}

	public void setChakra(int chakra) {
		this.chakra = chakra;
	}

	public List<Ataque> getAtaques() {
		return ataques;
	}

	public void setAtaques(List<Ataque> ataques) {
		this.ataques = ataques;
	}
    
    //getters y setters
    // ...
}
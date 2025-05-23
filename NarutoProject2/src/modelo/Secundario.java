package modelo;

public class Secundario {
    private int id;
    private String nombre;
    private String especie;
    private String frase;

    public Secundario() {}

    public Secundario(String nombre, String especie, String frase) {
        this.nombre = nombre;
        this.especie = especie;
        this.frase = frase;
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

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

    // Getters y setters
    
}
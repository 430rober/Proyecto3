package modelo;

public class Artefacto {
	// ATRIBUTOS
    private int id;
    private String nombre;
    private String descripcion;
    private int escenarioId;
    private int batallaId; // puede ser enigma o batalla
    private int numero1;

 // CONSTRUCTORES
    public Artefacto() {}

    public Artefacto(int id, String nombre, String descripcion, int escenarioId, int batallaId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.escenarioId = escenarioId;
        this.batallaId = batallaId;
    }

 // GETTERS Y SETTERS
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

	public int getEscenarioId() {
		return escenarioId;
	}

	public void setEscenarioId(int escenarioId) {
		this.escenarioId = escenarioId;
	}

	public int getBatallaId() {
		return batallaId;
	}

	public void setBatallaId(int batallaId) {
		this.batallaId = batallaId;
	}

    // OTROS MÉTODOS
	private static void sumarArtefacto() {
		
	}
}

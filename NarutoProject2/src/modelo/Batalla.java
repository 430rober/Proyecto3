package modelo;

public class Batalla {
    private int id;
    private String nombre;
    private String ubicacion;
    private Enemigo enemigo;
    private boolean recompensaArtefacto;
    
    public Batalla() {}

    public Batalla(int id, String ubicacion, String nombre, Enemigo enemigo, boolean recompensaArtefacto) {
    	this.id = id;
    	this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.enemigo = enemigo;
        this.recompensaArtefacto = recompensaArtefacto;
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Enemigo getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}

	public boolean isRecompensaArtefacto() {
		return recompensaArtefacto;
	}

	public void setRecompensaArtefacto(boolean recompensaArtefacto) {
		this.recompensaArtefacto = recompensaArtefacto;
	}

	
	// OTROS MÉTODOS
	
	private static void batallaEscenario() {
		
	}
	private static void ataqueConAliado() {
		
	}
	private static void sumarAtributos() {
		
	}
}

package modelo;

public class Escenario {
	private int id;
	private String nombre;
	private String terreno;

	public int getId() {
		return id;
	}

	public Escenario() {
	}

	public Escenario(int id, String nombre, String terreno, String momentoDia, String clima) {
		this.id = id;
		this.nombre = nombre;
		this.terreno = terreno;
		this.momentoDia = momentoDia;
		this.clima = clima;
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

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public String getMomentoDia() {
		return momentoDia;
	}

	public void setMomentoDia(String momentoDia) {
		this.momentoDia = momentoDia;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	private String momentoDia;
	private String clima;

	private static void elegirEscenario() {
		
	}
	private static void opcionesEscenario() {
		
	}
}
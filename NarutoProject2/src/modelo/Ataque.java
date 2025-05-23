package modelo;

public class Ataque {
	private int id;
	private String personaje;
	private String nombre;
	private int dañoTotal;
	private int dañoParcial;
	private int dañoBloqueo;
	private int chakraConsume;

	public Ataque() {
	}

	public Ataque(int id, String personaje, String nombre, int dañoTotal, int dañoParcial, int dañoBloqueo,
			int chakraConsume) {
		this.id = id;
		this.personaje = personaje;
		this.nombre = nombre;
		this.dañoTotal = dañoTotal;
		this.dañoParcial = dañoParcial;
		this.dañoBloqueo = dañoBloqueo;
		this.chakraConsume = chakraConsume;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDañoTotal() {
		return dañoTotal;
	}

	public void setDañoTotal(int dañoTotal) {
		this.dañoTotal = dañoTotal;
	}

	public int getDañoParcial() {
		return dañoParcial;
	}

	public void setDañoParcial(int dañoParcial) {
		this.dañoParcial = dañoParcial;
	}

	public int getDañoBloqueo() {
		return dañoBloqueo;
	}

	public void setDañoBloqueo(int dañoBloqueo) {
		this.dañoBloqueo = dañoBloqueo;
	}

	public int getChakraConsume() {
		return chakraConsume;
	}

	public void setChakraConsume(int chakraConsume) {
		this.chakraConsume = chakraConsume;
	}

	private static void ataqueProtagonista() {
		
	}
	private static void ataqueEnemigo() {
		
	}
}

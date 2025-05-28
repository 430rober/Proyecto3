package modelo;

public class Batalla {
    private String nombre;
    private Escenario escenario;
    private Enemigo enemigo;
    private Protagonista protagonista;

    public void calcularResultado(Protagonista p) {
        // Aplica penalizaciones según escenario y combate al enemigo
    }

    public String getNombre() { 
    	return nombre; 
    	}
    
    public Enemigo getEnemigo() { 
    	return enemigo; 
    	}
    
    public Escenario getEscenario() { 
    	return escenario; 
    	}
    
    
}

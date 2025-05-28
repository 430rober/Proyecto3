package modelo;

public class Ataque {
    private String nombre;
    private int dañoCompleto;
    private int esquivar;
    private int dañoBloqueo;

    public int getDañoCompleto() { 
    	return dañoCompleto; 
    	}
    
    public int getDañoBloqueo() { 
    	return dañoBloqueo; 
    	}
    
    public int getEsquivar() { 
    	return esquivar; 
    	}
    
    public String getNombre() { 
    	return nombre; 
    	}
}

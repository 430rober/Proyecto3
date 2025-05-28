package modelo;

public class Escenario {
    private String nombre;
    private String condicionesAtmosfericas;
    private String momentoDelDia;
    private String condicionTerreno;

    public int getPenalizacionAtaque() {
		return 0;
        // Calcula según condiciones
    }

    public int getPenalizacionDefensa() {
		return 0;
        // Calcula según condiciones
    }

    public String getNombre() { return nombre; }
    
    public void menuEscenario() {
    	System.out.println("ELIGE UNA UBICACIÓN A LA QUE IR:");
		System.out.println("");
		System.out.println("1.Cueva de la Niebla Oscura ");
		System.out.println("2.Laboratorio Perdido ");
		System.out.println("3.Templo del Tiempo ");
		System.out.println("4.Fortaleza de las Sombras");
		System.out.println("5.Santuario de la Arena Desolada ");
		System.out.println("6.Palacio Celestial ");
		System.out.println("\n - Volver al INICIO");
    }

}

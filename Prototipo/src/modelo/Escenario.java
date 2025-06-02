package modelo;

public class Escenario {
    private String nombre;
    private String descripcion;
    private String aliado;
    private Enemigo enemigo;
    private Enigma enigma;
    private Artefacto artefacto;
    private String conversacion;
    private boolean completado = false;

    public Escenario(String nombre, String descripcion, String aliado, Enemigo enemigo, Enigma enigma, Artefacto artefacto, String conversacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.aliado = aliado;
        this.enemigo = enemigo;
        this.enigma = enigma;
        this.artefacto = artefacto;
        this.conversacion = conversacion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getAliado() { return aliado; }
    public Enemigo getEnemigo() { return enemigo; }
    public Enigma getEnigma() { return enigma; }
    public Artefacto getArtefacto() { return artefacto; }
    public String getConversacion() { return conversacion; }
    public boolean isCompletado() { return completado; }
    public void marcarCompletado() { this.completado = true; }
}
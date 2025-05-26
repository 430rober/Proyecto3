package modelo;

public class Enigma {
    private String nombre;
    private String descripcion;
    private int puntosOtorgados;
    private String respuestaCorrecta;

    public boolean resolver(String respuesta) {
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }

    public int getPuntos() { return puntosOtorgados; }
    public String getDescripcion() { return descripcion; }
}

package modelo;

public class Enigma {
    private String pregunta;
    private String respuesta;

    public Enigma(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() { return pregunta; }
    public boolean comprobarRespuesta(String r) {
        return respuesta.equalsIgnoreCase(r.trim());
    }
}
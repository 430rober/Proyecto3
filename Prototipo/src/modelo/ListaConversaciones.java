package modelo;

import java.util.List;
import java.util.Map;

public class ListaConversaciones {
    private Map<Secundario, List<String>> conversaciones;

    public List<String> getFrases(Secundario s) {
        return conversaciones.get(s);
    }

    public void añadirFrase(Secundario s, String frase) {
        conversaciones.get(s).add(frase);
    }
}

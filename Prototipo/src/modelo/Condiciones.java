package modelo;

public class Condiciones {
    public enum Atmosfera { DESPEJADO, NUBOSO, LLUVIA, NIEVE }
    public enum MomentoDia { MAÑANA, TARDE, NOCHE }
    public enum Terreno { LLANO, ROCOSO, MONTAÑOSO }

    private Atmosfera atmosfera;
    private MomentoDia momento;
    private Terreno terreno;

    public Condiciones(Atmosfera atmosfera, MomentoDia momento, Terreno terreno) {
        this.atmosfera = atmosfera;
        this.momento = momento;
        this.terreno = terreno;
    }

    public int obtenerPenalizacionAtaque() {
        int penalizacion = 0;
        switch (atmosfera) {
            case LLUVIA -> penalizacion += 10;
            case NIEVE -> penalizacion += 20;
        }
        switch (terreno) {
            case ROCOSO -> penalizacion += 10;
            case MONTAÑOSO -> penalizacion += 20;
        }
        if (momento == MomentoDia.NOCHE) penalizacion -= 20; // bonificación
        return penalizacion;
    }

    public int obtenerPenalizacionDefensa() {
        int penalizacion = 0;
        if (momento == MomentoDia.NOCHE) penalizacion += 10;
        switch (terreno) {
            case ROCOSO -> penalizacion += 10;
            case MONTAÑOSO -> penalizacion += 20;
        }
        return penalizacion;
    }

    @Override
    public String toString() {
        return "Condiciones: " + atmosfera + ", " + momento + ", " + terreno;
    }
}

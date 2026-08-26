

package snake;


public class Nodo {
    private Segmento unidad;
    private Nodo sig;
    
    public Nodo(Segmento unSegmento) {
        unidad = unSegmento;
        sig = null;
    }

    public Segmento getUnidad() {
        return unidad;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setUnidad(Segmento unidad) {
        this.unidad = unidad;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}

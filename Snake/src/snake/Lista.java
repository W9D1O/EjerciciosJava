

package snake;

/* Puede que sea mejor llamarlo cuerpo*/
public class Lista {
    private Nodo cabeza;
    private int cantidad;
    private Nodo ult;
    
    public Lista(Nodo inicio) {
        cabeza = inicio;
        cantidad = 1;
        ult = null;
    }
    
    public void agregarNodo(Nodo nodo) {
        
        if(cabeza.getSig() == null) {
            cabeza.setSig(nodo);
            ult = nodo;
            cantidad++;
        } else {
            ult.setSig(nodo);
            ult = nodo;
            cantidad++;
        }
        
    }

    public Vector getPosicionInicial() {
        Vector pos = new Vector(cabeza.getUnidad().getX(),
                    cabeza.getUnidad().getY());
        return pos;
    }
    
    public ArrayVector getPosiciones() {
        ArrayVector posiciones = new ArrayVector(cantidad);
        Nodo aux = cabeza;
        for (int i = 0; i < cantidad; i++) {
            posiciones.agregarElemento(new Vector(aux.getUnidad().getX(),
            aux.getUnidad().getY()));
            aux = aux.getSig();
        }
        return posiciones;
    }
    
    


    /*Si dos elementos de la lista tenen los mismos
    valores para x e y devuelve verdadero*/
    public boolean identicaPosicion() {
        Segmento primerElemento = cabeza.getUnidad();
        Nodo aux = cabeza.getSig();
        boolean vf = false;        
        while (aux != null && (aux.getUnidad().getX() != primerElemento.getX()
                || aux.getUnidad().getY() != primerElemento.getY())) {
            aux = aux.getSig();
        }
        if (aux != null) vf = true;
        return vf;
    }
    
    
    public Nodo ultimoElemento() {
        return ult;
    }


    
    public void actualizarValores(Vector dir) {
        Vector posAnt = new Vector(cabeza.getUnidad().getX(),
                cabeza.getUnidad().getY());
        cabeza.getUnidad().aumentarX(dir.getX());
        cabeza.getUnidad().aumentarY(dir.getY());
        Nodo aux =  cabeza.getSig();
        while (aux != null) {
            Vector posAux = new Vector(aux.getUnidad().getX(),
                    aux.getUnidad().getY());
            aux.getUnidad().setX(posAnt.getX());
            aux.getUnidad().setY(posAnt.getY());
            posAnt = new Vector(posAux.getX(), posAux.getY());
            aux = aux.getSig();
        }
    }
}

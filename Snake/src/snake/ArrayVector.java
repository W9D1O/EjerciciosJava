

package snake;


public class ArrayVector {
    private Vector[] array;
    private int size;
    private int dimL;
    
    public ArrayVector(int size) {
        this.size = size;
        array = new Vector[this.size];
        dimL = 0;
    }
    
    public boolean isCompleto() {
        return size == dimL;
    }
    
    public void agregarElemento(Vector unVector) {
        if (!isCompleto()) {
            array[dimL] = unVector;
            dimL++;
        }
    }
    
    public boolean valorIdentico(Vector unVector) {
        boolean vf = false;
        for (Vector vector: array) {
            if (unVector.getX() == vector.getX() && 
                    unVector.getY() == vector.getY()) {
                vf = true;
                break;
            }
        }
        return vf;
    }
    
    public int len() {
        return dimL;
    }
    
    private boolean enRango(int posicion) {
        return posicion >= 0 && posicion < dimL;
    }
    
    /*deberia generar un error si doy algún valor fuera de rango*/
    public int getX(int posicion) {
        int n = 0;
        if (enRango(posicion)) n = array[posicion].getX();
        return n;
    }
    
    public int getY(int posicion) {
        int n = 0;
        if (enRango(posicion)) n = array[posicion].getY();
        return n;
    }
}

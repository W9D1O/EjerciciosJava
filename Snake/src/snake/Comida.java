

package snake;


public class Comida {
    private Vector posicion;
    private boolean estado;
    private final int radio = 15;
    /* TODO: Aveces aparece medio fuera de la ventana,
    abra que ver si necesita una 'offset'*/
    
    public Comida(int posX, int posY) {
        posicion = new Vector();
        actualizarPosicion(posX,posY);
        estado = true;
    }

    public int getX() {
        return posicion.getX();
    }

    public int getY() {
        return posicion.getY();
    }
    
    public int getRadio() {
        return radio;
    }
    
    public void setEstado(boolean vf) {
        if (vf) estado = false;
    }
    
    public void actualizarPosicion(int maxX, int maxY) {
        
        posicion.setX((int) (Math.random() * maxX));
        posicion.setY((int) (Math.random() * maxY));
    }
    
    
}

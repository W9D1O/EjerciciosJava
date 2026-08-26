

package snake;


public class Comida {
    private Vector posicion;
    
    public Comida(int posX, int posY) {
        posicion.setX(posX);
        posicion.setY(posY);
    }

    public int getX() {
        return posicion.getX();
    }

    public int getY() {
        return posicion.getY();
    }
    
    
}

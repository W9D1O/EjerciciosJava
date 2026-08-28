

package snake;


public class Comida {
    private Vector posicion;
    private boolean estado;
    private final double radio = 15;
    
    public Comida(int posX, int posY) {
        posicion.setX(posX);
        posicion.setY(posY);
        estado = true;
    }

    public int getX() {
        return posicion.getX();
    }

    public int getY() {
        return posicion.getY();
    }
    

    public void actualizarPosicion(int maxX, int maxY) {
        
        posicion.setX((int) (Math.random() * maxX));
        posicion.setY((int) (Math.random() * maxY));
    }
    
    
}

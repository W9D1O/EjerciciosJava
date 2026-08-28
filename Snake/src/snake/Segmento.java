

package snake;


public class Segmento {
    private Vector posicion; 
    
    public Segmento(int posX, int posY) {
        posicion = new Vector(posX, posY);

    }

    public Segmento(Vector nuevaPos) {
        this.posicion = nuevaPos;
    }
    
    public int getX() {
        return posicion.getX();
    }

    public int getY() {
        return posicion.getY();
    }
    
    public void setX(int x) {
        posicion.setX(x);
    }
    
    public void setY(int y) {
        posicion.setY(y);
    }
    
    public void aumentarX(int x) {
        this.posicion.setX(this.getX() + x);
        
    }
    
    
    public void aumentarY(int y) {
        this.posicion.setY(this.posicion.getY() + y);
    }


    
    @Override
    public String toString() {
        return "Valor de x: " + this.posicion.getX() + ", " + "Valor de y: " +
                this.posicion.getY();
    }
}

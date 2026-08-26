

package snake;


public class Vector {
    /*No se me ocurre un nombre mejor*/
    private int x;
    private int y;
    
    public Vector(int miX, int miY) {
        x = miX;
        y = miY;
    }

    public Vector() {
        
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}

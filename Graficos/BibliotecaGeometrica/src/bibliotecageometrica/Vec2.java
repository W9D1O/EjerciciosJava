

package bibliotecageometrica;


public class Vec2 {
    private double x;
    private double y;
    
    public Vec2() {
        
    }
    
    public Vec2(double x, double y) {
        
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double productoEscalar(Vec2 unVector) {
        return this.x * unVector.x + this.y * unVector.y;
    }
    
    public void multiplicarPorEscalar(double escalar) {
        this.x *= escalar;
        this.y *= escalar;
    }
    
    public void sumarVector(Vec2 vectorA, Vec2 unVector) {
        this.x += unVector.x;
        this.y += unVector.y;
    }
    
    public void restarVector(Vec2 vectorA, Vec2 unVector) {
        this.x -= unVector.x;
        this.y -= unVector.y;
    }
    
    
    public double modulo() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    
    public void normalizar() {
        double modulo = this.modulo();
        if (modulo != 0) {
            this.x /= modulo;
            this.y /= modulo;
        }
    }
    
}

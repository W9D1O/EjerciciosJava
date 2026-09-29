

package bibliotecageometrica;


public class Segmento {
    private Punto a;
    private Punto b;
    
    public Segmento(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }
    
    public double longitud() {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + 
               Math.pow(b.getY() - a.getY(), 2));
    }
    
    public Punto puntoMedio() {
        return new Punto((a.getX() + b.getX())/2,(a.getY() + b.getY())/2);
    }
}

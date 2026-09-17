

package sistemabiblioteca;


public class StockLibro {
    private final Libro unLibro;
    private final int cantidad;
    private int disponible;
    
    
    public StockLibro(Libro unLibro, int cantidad) {
        this.unLibro = unLibro;
        this.cantidad = cantidad;
        this.disponible = cantidad;
    }
    
    public boolean isDisponible() {
        return disponible != 0;
    }
    
    public void aumentar() {
        if (disponible < cantidad) {
            disponible++;
        }
    }
    
    public void disminuir() {
        if (isDisponible()) {
            disponible--;
        }
    }
    
    public Libro getLibro() {
        return this.unLibro;
    }
    
    /*Parece que el ISBN es unico para cada edicion, por lo tanto
    vamos asumir por el momento que esta biblioteca tiene todos
    sus libros de la misma edicion.*/
    public boolean identico(String isbn) {
        return this.unLibro.getISBN().equals(isbn);
    }
    
    @Override
    public String toString() {
        return this.unLibro + "\n" +
                "Unidades disponibles: " + this.disponible;
    }
}

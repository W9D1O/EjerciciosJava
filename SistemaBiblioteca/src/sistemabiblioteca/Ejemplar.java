

package sistemabiblioteca;


public class Ejemplar {
    private final Libro unLibro;
    private final int cantidad;
    private int disponible;
    
    
    public Ejemplar(Libro unLibro, int cantidad) {
        this.unLibro = unLibro;
        this.cantidad = cantidad;
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
    
    public boolean equals(Libro unLibro) {
        return this.unLibro.getAutor().equals(unLibro.getAutor()) &&
                this.unLibro.getISBN().equals(unLibro.getISBN()) &&
                this.unLibro.getTitulo().equals(unLibro.getTitulo());
    }
    
    @Override
    public String toString() {
        return this.unLibro + "\n" +
                "Unidades disponibles: " + this.disponible;
    }
}

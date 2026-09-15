

package sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;


public class ListaEjemplar {
    private List<Ejemplar> libros;
    
    public ListaEjemplar() {
         this.libros = new ArrayList <> ();
    }
    
    public void agregarLibro(Libro unLibro, int cantidad) {
        if (!existe(unLibro)) {
            this.libros.add(new Ejemplar(unLibro,cantidad));
        } else {
            System.out.println("Error: el libro que intenta cargar ya existe.");
        }
    }
    
    private boolean existe(Libro unLibro) {
        boolean vf = false;
        for (Ejemplar libro: this.libros) {
            if (libro.equals(unLibro)) return true;
        }
        return vf;
    }
    
    /* Codigo casi repetido, tendria que ver como puedo hacer
    para mejorarlo*/
    public boolean isDisponible(Libro unLibro) {
        boolean vf = false;
        for (Ejemplar libro: this.libros) {
            if (libro.equals(unLibro)) {
                return libro.isDisponible();
            }
        }
        
        return vf;
    }
    
    
    
}

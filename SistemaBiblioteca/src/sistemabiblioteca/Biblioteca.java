

package sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Ejemplar> libros;
    private List<Socio> socios;
    private List <Prestamo> prestamos;
    
    public Biblioteca() {
        this.libros = new ArrayList <> ();
        this.socios = new ArrayList <> ();
    }
    

    public void agregarLibro(Libro unLibro, int cantidad) {
        this.libros.add(new Ejemplar(unLibro,cantidad));
    }
    
    public void altaSocio(Socio unSocio) {
        
        this.socios.add(unSocio);
    }
}



package sistemagestiondebiblioteca;

import java.time.LocalDate;


public class Prestamo {
    private Libro libro;
    private Socio socio;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    public Prestamo(Libro unLibro, Socio unSocio, LocalDate fPrestamo) {
        if (unLibro == null || unSocio == null || fPrestamo == null) {
            throw new IllegalArgumentException("Prestamo no permite argumentos"
                    + " nulos.");
        }
        
        libro = unLibro;
        socio = unSocio;
        fechaPrestamo = fPrestamo;
    }
    
    public String getTituloLibro() {
        return this.libro.getTitulo();
    }
    
    public int getIsbnLibro() {
        return this.libro.getIsbn();
    }
    
    public int getAnioPubLibro() {
        return this.libro.getAnioPublicacion();
    }
    
    public String getAutorLibro() {
        return this.libro.getDatosAutor();
    }
}

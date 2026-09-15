

package sistemabiblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Prestamo {
    private Libro unLibro;
    private int idPrestamo;
    private final LocalDate fechaEntrega = LocalDate.now();
    
    
    public Prestamo(Libro unLibro) {
        this.unLibro = unLibro;
            
        }
    
    public int getId() {
        return this.idPrestamo;
    }
    
    @Override
    public String toString() {
        return "Prestamo Numero: " + this.getId() + "\n"
                + " Fecha de entrega: " + 
                this.fechaEntrega.format(DateTimeFormatter.ISO_DATE)
                + this.unLibro.toString() + "\n";
    }
}

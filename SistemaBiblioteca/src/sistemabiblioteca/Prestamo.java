

package sistemabiblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Prestamo {
    private Libro unLibro;
    private static int contador = 0;
    private final int idPrestamo;
    private final LocalDate fechaEntrega = LocalDate.now();
    
    
    public Prestamo(Libro unLibro) {
        this.unLibro = unLibro;
        idPrestamo = ++contador;    
        }
    

    
    public int getId() {
        return this.idPrestamo;
    }
    
    public Libro getLibro() {
        return this.unLibro;
    }
    
    @Override
    public String toString() {
        return "Prestamo Numero: " + this.getId() + "\n"
                + " Fecha de entrega: " + 
                this.fechaEntrega.format(DateTimeFormatter.ISO_DATE)
                + this.unLibro.toString() + "\n";
    }
}

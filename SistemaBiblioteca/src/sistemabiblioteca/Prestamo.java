

package sistemabiblioteca;


public class Prestamo {
    private Libro unLibro;
    private Socio unSocio;
    private int idPrestamo;
    
    
    public Prestamo(Libro unLibro, Socio unSocio) {
        this.unLibro = unLibro;
        this.unSocio = unSocio;
    }
    
    public int getId() {
        return this.idPrestamo;
    }
    
    @Override
    public String toString() {
        return "Prestamo Numero: " + this.getId() + "\n"
                + this.unLibro.toString() + "\n" +
                this.unSocio.toString();
    }
}

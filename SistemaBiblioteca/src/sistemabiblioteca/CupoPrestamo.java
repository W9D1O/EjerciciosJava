

package sistemabiblioteca;


public class CupoPrestamo {
    /*No se si es corrector dejar un final si inicializar y hacer la inicilizacion
    en el constructor*/
    private final int maxCupo;
    private int cantidad;
    private Prestamo[] prestamos;
    
    public CupoPrestamo(int maxCupo) {
        this.maxCupo = maxCupo;
        this.prestamos = new Prestamo[this.maxCupo];
        this.cantidad = 0;
    }
    
    private boolean isCompleto() {
        return this.cantidad == this.maxCupo;
    }
    
    public void recibePrestamo(Prestamo unPrestamo) {
        if (!isCompleto()) {
            this.prestamos[this.cantidad] = unPrestamo;
            this.cantidad++;
        }
    }
}

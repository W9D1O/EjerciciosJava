

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
    
    public boolean isCompleto() {
        return this.cantidad == this.maxCupo;
    }
    
    public void recibirPrestamo(Prestamo unPrestamo) {
        this.prestamos[this.cantidad] = unPrestamo;
        this.cantidad++;

    }
    
    private int posicionPrestamo(int idPrestamo) {
        int pos = -1;
        for (int i = 0; i < this.cantidad; i++) {
            if (this.prestamos[i].getId() == idPrestamo) return i;
        }
        return pos;
    }
    
    public Prestamo liberarPrestamo(int idPrestamo) {
        Prestamo devolucion = null;
        int pos = posicionPrestamo(idPrestamo);
        if (pos != -1) {
            if (pos + 1 == this.cantidad) this.cantidad--;
            else {
                devolucion = this.prestamos[pos];
                for (int i = pos; i < this.cantidad - 1; i++) {
                    this.prestamos[i] = this.prestamos[i + 1];
                }

            }
        } else {
            System.out.println("El Id ingresado no existe.");
        }
        return devolucion;
    }
    
    
    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < cantidad; i++) {
            string += this.prestamos[i].toString();
        }
        return string;
    }
}

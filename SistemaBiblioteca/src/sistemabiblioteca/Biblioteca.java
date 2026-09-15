

package sistemabiblioteca;


public class Biblioteca {
    private ListaLibro ejemplares;
    private ListaSocio socios;
    private static int numeroSocio = 0;
    private final int MAX_PRESTAMO = 4;
    
    public Biblioteca() {
        this.ejemplares = new ListaLibro();
        this.socios = new ListaSocio();

    }
    

    /*La idea es la siguiente addSocio retorna true si agrego al socio
    y false en caso contrario, es decir si no agregue nada decremento
    numeroSocio*/
    public void altaSocio(String nombre, int dni) {
        Socio unSocio = new Socio(nombre,dni,++numeroSocio,MAX_PRESTAMO);
        if (!this.socios.addSocio(unSocio)) numeroSocio--;

    }
    

    
    
    /* Necesito generar el id del prestamo, lo me queda claro donde lo tengo que
    generar.*/
    public void altaPrestamo(String isbn, int idSocio) {
        if (this.ejemplares.isDisponible(isbn) && this.socios.hayCupo(idSocio)) {
            Prestamo prestamo = new Prestamo(this.ejemplares.getLibro(isbn));
            this.socios.addPrestamo(prestamo, idSocio);
        }
    }
}

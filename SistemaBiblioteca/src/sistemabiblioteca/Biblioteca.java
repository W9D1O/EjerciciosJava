

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
    

    
    //TODO: Sospecho que seria util tener distintas variantes de este metodo.
    public void altaPrestamo(String isbn, int idSocio) {
        if (this.ejemplares.isDisponible(isbn) && this.socios.hayCupo(idSocio)) {
            /*No estoy seguro si estoy rompiendo el encapsulamiento
            pero creo que tengo que ser capaz de tomar el stock de 
            libros realizar el prestamo y hacer su correspondiente
            devolucion*/
            StockLibro stock = this.ejemplares.getStock(isbn);
            Prestamo prestamo = new Prestamo(stock.getLibro());
            stock.disminuir();
            this.socios.addPrestamo(prestamo, idSocio);
        }
    }
    
    
    /*Por el momento vamos a dejarlo asi pero tendria que ver si agrego una
    clase Devolucion por que definitivamente creo que deberia poder
    agregar la fecha de devolucion*/
    public void registrarDevolucion(int idPrestamo, int idSocio) {
        Prestamo prestamo = this.socios.devolucion(idPrestamo, idSocio);
        try {
            StockLibro stock = this.ejemplares.getStock(prestamo.
                    getLibro().getISBN());
            stock.aumentar();
        } catch (NullPointerException e) {
            System.out.println("Error: Prestamo ID invalido.");
        }
        
    }
}

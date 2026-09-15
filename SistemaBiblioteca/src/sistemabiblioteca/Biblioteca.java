

package sistemabiblioteca;


public class Biblioteca {
    private ListaEjemplar ejemplares;
    private ListaSocio socios;
    
    public Biblioteca() {
        this.ejemplares = new ListaEjemplar();

    }
    


    public void altaSocio(Socio unSocio) {
        this.socios.addSocio(unSocio);

    }
    

    
    
    /* Necesito generar el id del prestamo, lo me queda claro donde lo tengo que
    generar.*/
    public void altaPrestamo(Libro unLibro, Socio unSocio) {
        if (this.ejemplares.isDisponible(unLibro)) {
            Prestamo prestamo = new Prestamo(unLibro);
            
        }
    }
}

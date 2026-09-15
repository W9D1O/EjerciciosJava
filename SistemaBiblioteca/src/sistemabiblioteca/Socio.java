

package sistemabiblioteca;


public class Socio {
    private String nombre;
    private int dni;
    private int id;
    private CupoPrestamo prestamos;
    
    public Socio(String nombre, int dni, int id, int maxCupo) {
        this.nombre = nombre;
        this.dni = dni;
        this.id = id;
        this.prestamos = new CupoPrestamo(maxCupo);
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getDni() {
        return this.dni;
    }
    
    public int getId() {
        return this.id;
    }
    
}

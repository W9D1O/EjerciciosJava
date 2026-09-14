

package sistemabiblioteca;


public class Socio {
    private String nombre;
    private int dni;
    private int id;
    
    public Socio(String nombre, int dni, int id) {
        this.nombre = nombre;
        this.dni = dni;
        this.id = id;
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

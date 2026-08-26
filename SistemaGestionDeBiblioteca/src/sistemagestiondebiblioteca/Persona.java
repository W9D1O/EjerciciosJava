

package sistemagestiondebiblioteca;


public class Persona {
    private String apellido;
    private String nombre;
    private int dni;
    
    public Persona(){
        
    }
    
    public Persona(String apellido, String nombre, int dni) {
        if (apellido.equals("") || apellido.equals(nombre)) {
            throw new IllegalArgumentException("El apellido no puede estar"
                    + " vacio o ser igual al nombre.");
        } else if (dni < 0)  throw new IllegalArgumentException("El DNI no"
                + " puede ser negativo");
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    private void IllegalString(String s) {
        if (s.equals("")) {
            throw new IllegalArgumentException("El apellido no puede estar"
                    + " vacio o ser igual al nombre.");
        }
    }
    
    private void IllegalInt(int dni) {
        if (dni < 0)  throw new IllegalArgumentException("El DNI no"
                + " puede ser negativo");
    }
    
    public String getApellido() {
        return apellido;
    }
    /*Lo unico malo es que con los setter apellido y nombre
    no estoy corroborando que no sean iguales.*/
    public void setApellido(String apellido) {
        IllegalString(apellido);
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        IllegalString(nombre);
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        IllegalInt(dni);
        this.dni = dni;
    }
    
    
    @Override
    public String toString() {
        return "Apellido: " + this.getApellido() + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "DNI: " + this.getDni();
    }

}

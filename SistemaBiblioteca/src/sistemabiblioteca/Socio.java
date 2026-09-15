

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

    public void setPrestamo(Prestamo unPrestamo) {
        this.prestamos.recibirPrestamo(unPrestamo);
    }
    
    public Prestamo devolverPrestamo(int idPrestamo) {
        return this.prestamos.liberarPrestamo(idPrestamo);
    }
    
    /*Puede que esto no sea el lugar correcto para este metodo
    pero por el momento lo voy a dejar de esta manera*/
    public boolean equals(Socio unSocio) {
        return this.nombre.equals(unSocio.nombre) && this.dni == unSocio.dni &&
                this.id == unSocio.id;
        /*cambien los argumentos anteriores po unSocio, estoy asumiento que
        dado que estoy desde la misma clase puede acceder a las variables
        de instancia, ademas por como lo estoy haciendo estoy diciendo que 
        si los valores de los atributos sin iguales es el mismo objeto
        por mas que la referencia no sea la misma imagino que esta mal pero por
        el momento soluciono el problema de tener socios repetidos*/
    }
}

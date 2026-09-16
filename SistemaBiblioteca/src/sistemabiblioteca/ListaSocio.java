

package sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;


public class ListaSocio {
    private List<Socio> socios;
    
    public ListaSocio() {
        this.socios = new ArrayList <> ();
    }
    
    private boolean identico(Socio unSocio, Socio otroSocio) {
        return unSocio.getNombre().equalsIgnoreCase(otroSocio.getNombre()) &&
                unSocio.getDni() == otroSocio.getDni();
    }
    
    private Socio getSocio(int idSocio) {
        for (Socio socio: this.socios) {
            if (socio.getId() == idSocio) return socio;
        }
        return null;
    }
    
    private boolean existe(Socio unSocio) {
        boolean vf = false;
        for (Socio socio: socios) {
            if (identico(socio,unSocio)) return true;
        }
        return vf;
    }
    
    public boolean addSocio(Socio unSocio) {
        if (!existe(unSocio)) {
            this.socios.add(unSocio);
            return true;
        } else {
            System.out.println("El socio ingresado ya existe.");
            return false;
        }

    }
    
    public boolean hayCupo(int idSocio) {
        for (Socio socio: socios) {
            if (socio.getId() == idSocio) {
                return socio.hayCupo();
            }
        }
        return false;
    }
    
    public void addPrestamo(Prestamo prestamo, int idSocio) {
        getSocio(idSocio).addPrestamo(prestamo);
    }
    
    public Prestamo devolucion(int idPrestamo, int idSocio) {
        Prestamo prestamo = null;
        try {
           Socio socio = getSocio(idSocio); 
           prestamo = socio.devolverPrestamo(idPrestamo);
        } catch (NullPointerException e) {
            System.out.println("Error Socio ID no valido.");
        }
        
        return prestamo;
        
    }
}



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
    
    private boolean existe(Socio unSocio) {
        boolean vf = false;
        for (Socio socio: socios) {
            if (identico(socio,unSocio)) return true;
        }
        return vf;
    }
    
    public void addSocio(Socio unSocio) {
        if (!existe(unSocio)) {
            this.socios.add(unSocio);
        } else {
            System.out.println("El socio ingresado ya existe.");
        }

    }
}

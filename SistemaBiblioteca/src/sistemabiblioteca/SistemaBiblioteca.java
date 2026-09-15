package sistemabiblioteca;

public class SistemaBiblioteca {


    public static void main(String[] args) {
        Biblioteca unaBiblio = new Biblioteca();
        Socio unSocio = new Socio("juan perez",123,456,4);
        Socio otroSocio = new Socio("juan perez",123,456,4);
        System.out.println(unSocio.equals(otroSocio));
        System.out.println(unSocio.getNombre().equals(otroSocio.getNombre()));
        System.out.println(unSocio.getDni() == otroSocio.getDni());
    }

}

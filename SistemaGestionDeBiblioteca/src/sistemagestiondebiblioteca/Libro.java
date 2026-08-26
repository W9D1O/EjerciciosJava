

package sistemagestiondebiblioteca;


public class Libro {
    private int isbn;
    private String titulo;
    private Persona autor;
    private int anioPublicacion;
    /*Un libro esta disponible si es verdadero sino signiofica
    que fue prestado.*/
    private boolean disponible;
    
    public Libro(int isbn, String titulo, Persona autor, int anioPublicacion) {
        if (isbn < 0 || anioPublicacion < 0) {
            throw new IllegalArgumentException("El isbn y el anio de publicacion"
            + " deben ser valores positivos");
        } else if (autor == null) {
            throw new IllegalArgumentException("El autor debe ser diferente"
                    + " de null");
        } else if (titulo.equals("")) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDatosAutor() {
        return this.autor.getApellido() + " "
                + this.autor.getNombre();
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void prestar() {
        if (isDisponible()) {
            this.disponible = false;
        } else {
            System.out.println("El libro no se encuentra disponible");
        }
    }
    
    public void devolver() {
        if (!isDisponible()) {
            this.disponible = true;
        } else {
            System.out.println("El libro no fue prestado.");
        }
    }
    
    private String estadoToString() {
        String r =  "";
        if (isDisponible()) r ="Disponible.";
        else r = "No se encuentra disponible.";
        
        return r;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + this.getTitulo() + "\n"
                + "Anio de Publicacion: " + this.getAnioPublicacion() + "\n"
                + "ISBN: " + this.getIsbn() + "\n" +
                "Autor: " + this.autor.toString() + "\n" +
                "Estado: " + this.estadoToString();
    }
}

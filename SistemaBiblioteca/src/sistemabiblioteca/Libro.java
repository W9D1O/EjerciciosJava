

package sistemabiblioteca;


public class Libro {
    private String autor;
    private String isbn;
    private String titulo;
    
    public Libro(String autor, String isbn, String titulo) {
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
    } 
    
    
    public String getAutor() {
        return this.autor;
    }        
            
    public String getISBN() {
        return this.isbn;
    }
            
    public String getTitulo() {
        return this.titulo;
    }
    
    @Override
    public String toString() {
        return this.titulo + " " + this.autor +
                "\n" + this.isbn;
    }
 }

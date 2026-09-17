

package cargaarchivo;

//Estoy mezclando ingles y espaniol pero no se me ocurria nombre en espaniol

import java.util.ArrayList;

//De todas maneras no estoy seguro de que este sea un nombre adecuado.
public class LineToToken {
    private GenerarToken generador;
    private ArrayList <String> tokens;
    private Cursor cursor;
    
    public LineToToken(String linea) {
        this.tokens = new ArrayList();
        Cursor cursor = new Cursor();
        generarListaToken(linea,cursor);
        
    }

    private void generarListaToken(String linea, Cursor cursor) {
        do {
            try {
                this.generador = new GenerarToken(linea,cursor);
                this.tokens.add(this.generador.getToken());
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR: Linea vacia.");
            }
        } while (!this.generador.isOver());
    }

    public ArrayList <String> ListaToken() {
        return this.tokens;
    }
}

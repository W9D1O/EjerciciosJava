

package cargaarchivo;

//Estoy mezclando ingles y espaniol pero no se me ocurria nombre en espaniol

import java.util.ArrayList;

//De todas maneras no estoy seguro de que este sea un nombre adecuado.
public class LineToToken {
    private GenerarToken generador;
    private ArrayList <String> tokens;
    private ArrayList <Integer> numeros;
    private Cursor cursor;
    
    public LineToToken(String linea) {
        this.tokens = new ArrayList();
        this.cursor = new Cursor();
        generarListaToken(linea);
        
    }


    private void generarListaToken(String linea) {
        do {
            try {
                this.generador = new GenerarToken(linea, cursor);
                String s = this.generador.getToken();
                if (!this.generador.isInteger()) this.tokens.add(s);
                else this.numeros.add(Integer.parseInt(s));
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR: Linea vacia.");
            }
        } while (!this.generador.isOver());
    }

    public ArrayList <String> ListaToken() {
        return this.tokens;
    }
}

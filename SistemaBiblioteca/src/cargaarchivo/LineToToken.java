

package cargaarchivo;

//Estoy mezclando ingles y espaniol pero no se me ocurria nombre en espaniol

import java.util.ArrayList;

//De todas maneras no estoy seguro de que este sea un nombre adecuado.
public class LineToToken {
    private GenerarToken generador;
    private ArrayList <String> tokens;
    
    public LineToToken(String linea) {

        generarListaToken(linea);
        
    }

    private void generarListaToken(String linea) {
        do {
            try {
                
                this.generador = new GenerarToken(linea);
                this.tokens.add(this.generador.getToken());
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR: Linea vacia.");
            }
        } while (!this.generador.isOver());
    }

}

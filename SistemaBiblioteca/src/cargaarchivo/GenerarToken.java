

package cargaarchivo;


public class GenerarToken {
    private Cursor cursor;
    private String token;
    private boolean over;
    
    public GenerarToken(String cadena, Cursor cursor) {
        this.cursor = cursor;
        over = false;
        this.token = procesarCadena(cadena);
        
    }
    
    
    private String procesarCadena(String cadena) {
        String s = "";
        do {
            s += cadena.toCharArray()[cursor.getPos()];
            cursor.aumentar();
        } while (cursor.getPos() < cadena.length() - 1 &&
                cadena.toCharArray()[cursor.getPos()] != ','
                && cadena.toCharArray()[cursor.getPos()] != '\n');
        
        if (cadena.toCharArray()[cursor.getPos()] == '\n') {
            cursor.resetCursor();
            this.over = true;
        } else if (cadena.toCharArray()[cursor.getPos()] == ','
                && cursor.getPos() < cadena.length() - 1) {
            cursor.aumentar();

        } else {
            s += cadena.toCharArray()[cursor.getPos()];
            cursor.resetCursor();
            this.over = true;
        }

        return s;
    }

    public String getToken() {
        return token;
    }
    
    public boolean isOver() {
        return this.over;
    }
    
}

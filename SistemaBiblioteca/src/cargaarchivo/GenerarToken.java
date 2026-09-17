

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
    
    //Me resultas poco simpatico pero funcionas, por lo menos por ahora.
    private String procesarCadena(String cadena) {
        String s = "";
        while (cursor.getPos() < cadena.length()
                && cadena.toCharArray()[cursor.getPos()] != ','
                && cadena.toCharArray()[cursor.getPos()] != '\n') {
            
            s += cadena.toCharArray()[cursor.getPos()];
            cursor.aumentar();
        }
        if (cursor.getPos() == cadena.length()) {
            cursor.resetCursor();
            this.over = true;
            return s;
        }
        
        if (cadena.toCharArray()[cursor.getPos()] == '\n') {
            cursor.resetCursor();
            this.over = true;
        } else if (cursor.getPos() < cadena.length() - 1 &&
                cadena.toCharArray()[cursor.getPos()] == ',') cursor.aumentar();

        return s;
    }

    public String getToken() {
        return token;
    }
    
    public boolean isOver() {
        return this.over;
    }
    
}

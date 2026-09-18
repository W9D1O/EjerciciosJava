

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
        String contenido = "";
        while (cursor.getPos() < cadena.length()
                && cadena.toCharArray()[cursor.getPos()] != ',') {

            contenido += cadena.toCharArray()[cursor.getPos()];
            cursor.aumentar();
        }
        if (cursor.getPos() == cadena.length()) {
            cursor.resetCursor();
            this.over = true;
            return contenido;
        }

        if (cursor.getPos() < cadena.length() - 1
                && cadena.toCharArray()[cursor.getPos()] == ',') {
            cursor.aumentar();
        } else if (cursor.getPos() == cadena.length() - 1 &&
                cadena.toCharArray()[cursor.getPos()] == ',') this.over = true;

        return contenido;
    }

    public String getToken() {
        return token;
    }
    
    public boolean isInteger() {
        for (int i = 0; i < token.length(); i++) {
            if (token.codePointAt(i) < 48 || token.codePointAt(i) > 57) return false;
        } 
        return true;
    }
    
    
    public boolean isOver() {
        return this.over;
    }
    
}

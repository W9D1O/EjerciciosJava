

package cargaarchivo;


public class GenerarToken {
    private Cursor cursor;
    private String token;
    private boolean over;
    
    public GenerarToken(String cadena) {
        this.cursor = new Cursor();
        over = false;
        this.token = procesarCadena(cadena);
        
    }
    
    
    private String procesarCadena(String cadena) {
        String s = "";
        while (cadena.toCharArray()[cursor.getPos()] != ',' 
                && cadena.toCharArray()[cursor.getPos()] != '\n') {
          s += cadena.toCharArray()[cursor.getPos()];
          cursor.aumentar();
        }
        
        
        if (cadena.toCharArray()[cursor.getPos()] == '\n') {
            cursor.resetCursor();
            this.over = true;
        }
        else if (cadena.toCharArray()[cursor.getPos()] == ','
                && cursor.getPos() < cadena.length() - 1) cursor.aumentar(); 
        else {
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



package cargaarchivo;


public class Cursor {
    private static int cursor;
    
    public Cursor() {
        cursor = 0;
    }
    
    public void aumentar() {
        this.cursor++;
    }
    
    public int getPos() {
        return this.cursor;
    }
    
    public void resetCursor() {
        this.cursor = 0;
    }
}

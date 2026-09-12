

package snake;


public class Comida {
    private Vector posicion;
    private boolean estado;
    private final int radio = 15;
    /* TODO: Aveces aparece medio fuera de la ventana,
    abra que ver si necesita una 'offset'*/
    
    public Comida(int posX, int posY, ArrayVector posOcupadas) {
        posicion = new Vector();
        estado = false;
        actualizarPosicion(posX,posY,posOcupadas);
    }

    public int getX() {
        return posicion.getX();
    }

    public int getY() {
        return posicion.getY();
    }
    
    public int getRadio() {
        return radio;
    }
    
    public void setEstado(boolean vf) {
        if (vf) estado = false;
    }
    
    public void actualizarPosicion(int maxX, int maxY, ArrayVector posOcupadas) {
        System.out.println("x: " + maxX + " y: " + maxY);
        if (!estado) {
            int x = (int) (Math.random() * (maxX - 1));
            int y = (int) (Math.random() * (maxY - 1));
            
            posicion.setX(x);
            posicion.setY(y);
            estado = true;
        }
    }
    
    
}

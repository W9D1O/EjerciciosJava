

package snake;


public class Snake {
    private Lista cuerpo;
    private boolean comio;
    private Vector colaPosAnt;
    private boolean reposo;
    private Vector direccion;
    
    public Snake(Vector posicionInicial) {
        comio = false;
        reposo = true;
        direccion = new Vector(1,0);
        initCuerpo(posicionInicial);
    }
    
    private void initCuerpo(Vector posicionInicial) {
        Nodo aux = new Nodo(new Segmento(posicionInicial));
        cuerpo = new Lista(aux);
        int x = posicionInicial.getX();
        int y = posicionInicial.getY();
        x--;
        cuerpo.agregarNodo(new Nodo(new Segmento(x,y)));
        x--;
        cuerpo.agregarNodo(new Nodo(new Segmento(x,y)));
        x--;
    }
    
    public void comer(Comida algunaComida) {
        if (algunaComida.getX() == cuerpo.getPosicionInicial().getX() &&
                algunaComida.getY() == cuerpo.getPosicionInicial().getY()) {
            comio = true;
        }
    }
    
    public void setDireccion(Vector dir) {
        if (direccion.getX() * -1 != dir.getX() ||
                direccion.getY() * -1 != dir.getY()) {
            direccion = dir;
            System.out.println(direccion.getX() + " " + direccion.getY());
        }
    }
    
    public void crecer() {
        if (comio) {
            Segmento nuevo = new Segmento(colaPosAnt);
            cuerpo.agregarNodo(new Nodo(nuevo));
            comio = false;
        }
    }
    
    private boolean cuerpoColision() {
        return cuerpo.identicaPosicion();
    }
    
    public boolean hayColision(Vector maxP) {
        boolean vf = false;
        if (cuerpo.getPosicionInicial().getX() < 0 || cuerpo.getPosicionInicial().getY() < 0
                || cuerpo.getPosicionInicial().getX() > maxP.getX() ||
                cuerpo.getPosicionInicial().getY() > maxP.getY()) {
            vf = true;
        }
        return cuerpoColision() || vf;
    }
    
    
    public void mover() {
        Segmento aux = cuerpo.ultimoElemento().getUnidad();
        if (reposo) {
            reposo = false;
            /*Averiguar con recpecto a los objetos primitivos(creo que se llaman
            asi), si al copiarlo se copian por valor, entiendo que si
            hubiera hecho colaPosAnta = aux tendria una referencia de
            ult.getSegmento*/
            colaPosAnt = new Vector(aux.getX(),aux.getY());
        } else {
            colaPosAnt.setX(aux.getX());
            colaPosAnt.setY(aux.getY());
        }
        
        cuerpo.actualizarValores(direccion);
        
    }
    
    public Vector[] getPosiciones() {
        return cuerpo.getPosiciones();
    }
    
}


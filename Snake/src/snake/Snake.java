

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
        cuerpo.agregarNodo(new Nodo(new Segmento(posicionInicial.getX() -1,
                            posicionInicial.getY())));
        cuerpo.agregarNodo(new Nodo(new Segmento(posicionInicial.getX() -2,
                            posicionInicial.getY())));        
    }
    
    public void comer(Comida algunaComida) {
        if (algunaComida.getX() == cuerpo.getPosicion().getX() &&
                algunaComida.getY() == cuerpo.getPosicion().getY()) {
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
        if (cuerpo.getPosicion().getX() < 0 || cuerpo.getPosicion().getY() < 0
                || cuerpo.getPosicion().getX() > maxP.getX() ||
                cuerpo.getPosicion().getY() > maxP.getY()) {
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
    
    
}

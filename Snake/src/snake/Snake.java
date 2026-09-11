

package snake;


public class Snake {
    private Lista cuerpo;
    private boolean comio;
    private Vector colaPosAnt;
    private boolean reposo;
    private Vector direccion;
    private int velocidad;
    private int acumulador;
    
    
    public Snake(Vector posicionInicial) {
        comio = false;
        reposo = true;
        velocidad = 400;
        acumulador = 0;
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
    
    private void aumentarAcu() {
        this.acumulador += velocidad;
    }
    
    
    /* No se me acurre que nombre ponerle, digamos que lo libera para que se
    pueda mover*/
    private boolean liberar() {
        boolean vf = false;
        if (acumulador >= 100000) vf = true;
        return vf;
    }
    
    public boolean comer(Comida algunaComida) {
        if (algunaComida.getX() == cuerpo.getPosicionInicial().getX() &&
                algunaComida.getY() == cuerpo.getPosicionInicial().getY()) {
            comio = true;
        }
        return comio;
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
    
    public boolean cuerpoColision() {
        return cuerpo.identicaPosicion();
    }
    

    public void mover() {
        Segmento aux = cuerpo.ultimoElemento().getUnidad();
        if (reposo) {
            aumentarAcu();
            reposo = false;
            /*Averiguar con recpecto a los objetos primitivos(creo que se llaman
            asi), si al copiarlo se copian por valor, entiendo que si
            hubiera hecho colaPosAnta = aux tendria una referencia de
            ult.getSegmento*/
            colaPosAnt = new Vector(aux.getX(),aux.getY());
        } else {
            aumentarAcu();
 
            colaPosAnt.setX(aux.getX());
            colaPosAnt.setY(aux.getY());

            
        }
        
        if (liberar()) {
        cuerpo.actualizarValores(direccion);
        acumulador = 0;
        }
        
    }
    
    public Vector getHeadPosicion() {
        return cuerpo.getPosicionInicial();
    }
    
    public Vector[] getPosiciones() {
        return cuerpo.getPosiciones();
    }
    
}


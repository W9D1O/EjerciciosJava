
package sistemabancario;

/**
 *
 * Podria haber hecho una clase abstracta para arraay pero, es 
 * preferible por el momento ir avanzando de a poco.
 */
public class ArrayCuenta {
    private Cuenta[] array;
    private int dimL;
    private int max;
    
    public ArrayCuenta(int maximo){
        this.max = maximo;
        this.dimL = 0;
        this.array = new Cuenta[this.max];
        for (int i = 0; i < this.max; i++) {
            this.array[i] = new Cuenta();
        }
    }
    
    public Cuenta getCuenta(int posicion){
        Cuenta aux = null;
        if (posicion > 0 && posicion < this.dimL) {
            aux = this.array[posicion];
        }
        
        return aux;
    }
    
    
    public int getIndex(int numeroCuenta){
        int i = 0;
        while(i < this.dimL  &&
                (this.array[i] == null || 
                this.array[i].getNumero() != numeroCuenta)) i++;
        if (i >= this.dimL) i = -1;
        return i;
    }
    
    public void agregarCuenta(Cuenta nueva){
        if (this.dimL < this.max) {
            this.array[this.dimL] = nueva;
            this.dimL++;
            
        }
    }
    
    /*Cambiamos esto al final ahora obtenemos la posicion
    en base el numero de cuenta, es decir
    mis cuenta se agregar de forma lineal pero el numero
    de cuenta no se va a corresponder con el indice que ocupa*/
    public void eliminarCuenta(int numeroCuenta){
        int pos = this.getIndex(numeroCuenta);
        if (pos >= 0 && pos < this.dimL) {
            for (int i = pos; i < this.dimL; i++) {
                this.array[i] = this.array[i + 1];
                /*esto va a tener que ser cambiadoa*/
            }
        }
    }
    
}

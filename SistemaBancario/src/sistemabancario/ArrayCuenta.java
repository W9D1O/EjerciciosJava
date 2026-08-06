/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

/**
 *
 * @author w9d1o
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
    
    public Cuenta getCuenta(int numero){
        return this.array[numero];
    }

    public void agregarCuenta(){
        if (this.dimL < this.max) {
            Cuenta nueva = new Cuenta(this.dimL);
            this.array[this.dimL] = nueva;
            this.dimL++;
            
        }
    }
    
    /*Tenemos un problea, estamos usando el indice
    del array como numero de cuenta*/
    public void eliminarCuenta(int pos){
        if (pos >= 0 && pos < this.dimL) {
            for (int i = pos; i < this.dimL; i++) {
                this.array[i] = this.array[i + 1];
                /*esto va a tener que ser cambiadoa*/
            }
        }
    }
    
}

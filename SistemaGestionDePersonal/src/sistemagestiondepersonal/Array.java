/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

import static sistemagestiondepersonal.Empleado.aPositivo;

/**
 *
 * @author w9d1o
 */
public class Array {
    private int max;
    private int dimL;
    
    public Array(int max) {
        max = aPositivo(max);
        this.max = max;
        this.dimL = 0;
    }
    /*Como la clase no es abstracta no puedo declarar metodos generales*/
    
    public int getMaximo() {
        return this.max;
    }
    
    public boolean hayLugar() {
        return  this.dimL < this.max;
    }
    
    public int getOcupada() {
        return this.dimL;
    }
    
    public void aumentarOcupadas() {
        this.dimL++;
    }
    
    public void disminuirOcupadas() {
        this.dimL--;
    }
    
    /*Deberia ser obstractos pero no lo puedo usar*/
    public int getIndex(int valor) {
        return valor;
    }
    
    /* Elimina el elemento en la posicion
    despazando los elementos siguientes del array y
    disminuyendo el valor de dimLs*/
    public void eliminarElemento(int posicion) {
        
    }
}

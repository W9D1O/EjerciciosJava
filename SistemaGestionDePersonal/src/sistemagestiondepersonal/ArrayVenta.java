/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

/**
 *
 * @author w9d1o
 */
public class ArrayVenta extends Array {
    private Venta[] ventas;
    
    public ArrayVenta(int max) {
        super(max);
        this.ventas = new Venta[max];
    }
    
    public void agregarVenta(Venta nueva) {
        if (hayLugar()) {
            this.ventas[getOcupada()] = nueva;
        }
    }

}

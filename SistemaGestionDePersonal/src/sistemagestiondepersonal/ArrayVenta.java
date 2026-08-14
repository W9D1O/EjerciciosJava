/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

import java.math.BigDecimal;

/**
 *
 * @author w9d1o
 */
public class ArrayVenta extends Array {
    private Venta[] ventas;
    private ArrayNumero numerosDeVenta;
    
    public ArrayVenta(int max) {
        super(max);
        this.ventas = new Venta[max];
        this.numerosDeVenta = new ArrayNumero(max);
    }
    
    public void agregarVenta(Venta nueva) {
        if (hayLugar()) {
            nueva.setNumeroVenta(this.numerosDeVenta.obtenerNumero());
            this.ventas[getOcupada()] = nueva;
            aumentarOcupadas();
        }
    }
    
    /*A tener en cuenta si no encuentra el numero de venta el resultado de
    index va a ser igual a getOcupadas, es decir va a devolver la contidad de
    elementos ocupados en el array, como en indice de comienzo es cero
    el valor de getOcupada va a ser anulo o va a salirse de los indices
    valids del array*/
    @Override
    public int getIndex(int numeroVenta) {
        int i = 0;
        while (i < super.getOcupada() &&
                this.ventas[i].getNumeroVenta() != numeroVenta) i++;
        
        return i;
    }
    
    @Override
    public void eliminarElemento(int posicion) {
        int max = super.getOcupada();
        if( posicion >= 0 && posicion < max) {
            for (int i = posicion; i < max - 1; i++) {
                this.ventas[i] = this.ventas[i + 1];
            }
            /*Si estoy haciendo doble trabajo*/
            this.numerosDeVenta.eliminarElemento(posicion);
            super.disminuirOcupadas();
        }
    }

    public BigDecimal totalArrayVenta() {
        BigDecimal total = new BigDecimal(0);
        for (int i = 0; i < super.getOcupada(); i++) {
            total.add(this.ventas[i].ventaTotal());
        }
        return total;
    }
    
    @Override
    public String toString() {
        String informe = "";
        for (int i = 0; i < super.getOcupada(); i++) {
            informe += "\n" + this.ventas[i].toString();
        }
        return informe;
    }
}

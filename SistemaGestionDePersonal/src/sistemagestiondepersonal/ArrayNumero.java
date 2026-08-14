/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;
import java.util.concurrent.ThreadLocalRandom;
import static sistemagestiondepersonal.Empleado.aPositivo;
/**
 *
 * @author w9d1o
 */
public class ArrayNumero extends Array{
    private int numeros[];

    
    public ArrayNumero(int max) {
        super(max);
        this.numeros = new int[max];
    }
    
    private boolean existe(int num) {
        boolean vf = false;
        int i = 0;
        while (i < this.getOcupada() && this.numeros[i] != num) i++;
        
        if (i < this.getOcupada()) vf = true;
        
        return vf;
    }

    public void agregarNumero(int unNumero) {
        unNumero = aPositivo(unNumero);
        if (hayLugar() && !existe(unNumero)) {
            this.numeros[getOcupada()] = unNumero;
            aumentarOcupadas();
        }
    }
    
    private void generarNumeroAleatorio() {
        if (this.getOcupada() == 0) {
            this.numeros[getOcupada()] = ThreadLocalRandom.current()
                                .nextInt(1, Integer.MAX_VALUE);
            aumentarOcupadas();
        } else {
            if (hayLugar()) {
            int n = ThreadLocalRandom.current()
                    .nextInt(1, Integer.MAX_VALUE);
            while (this.existe(n)) {
              n = ThreadLocalRandom.current()
                    .nextInt(1, Integer.MAX_VALUE);  
            }
            
            this.numeros[this.getOcupada()] = n;
            aumentarOcupadas();
            }
        }
    }
    

    
    @Override
    public void eliminarElemento(int posicion) {
        int max = super.getOcupada();
        if( posicion >= 0 && posicion < max) {
            for (int i = posicion; i < max - 1; i++) {
                this.numeros[i] = this.numeros[i + 1];
            }
            super.disminuirOcupadas();
        }
    }
    
    /*Obtiene el ultimo valor agregado*/
    public int obtenerNumero() {
        this.generarNumeroAleatorio();
        int n = this.numeros[this.getOcupada() - 1];    
        return n;
        }
    }


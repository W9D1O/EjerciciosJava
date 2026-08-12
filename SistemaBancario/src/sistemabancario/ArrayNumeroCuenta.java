/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author w9d1o
 */
public class ArrayNumeroCuenta {
    private int numeros[];
    private int max;
    private int dimL;
    
    public ArrayNumeroCuenta(int max) {
        this.max = max;
        this.dimL = 0;
        this.numeros = new int[this.max];
    }
    
    private boolean existe(int num) {
        boolean vf = false;
        int i = 0;
        while (i < this.dimL && this.numeros[i] != num) i++;
        
        if (i < this.dimL) vf = true;
        
        return vf;
    }
    
    private void generarNumeroCuenta() {
        if (this.dimL == 0) {
            this.numeros[dimL] = ThreadLocalRandom.current()
                                .nextInt(1, Integer.MAX_VALUE);
            this.dimL++;
        } else {
            int n = ThreadLocalRandom.current()
                    .nextInt(1, Integer.MAX_VALUE);
            while (this.existe(n)) {
              n = ThreadLocalRandom.current()
                    .nextInt(1, Integer.MAX_VALUE);  
            }
            
            this.numeros[this.dimL] = n;
            this.dimL++;
        }
    }
        
    public int obtenerNumero() {
        this.generarNumeroCuenta();
        int n = this.numeros[this.dimL - 1];    
        return n;
        }
    }


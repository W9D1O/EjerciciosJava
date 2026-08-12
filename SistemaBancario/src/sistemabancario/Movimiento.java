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
public class Movimiento {
    private float monto;
    private float saldoRestante;
    private int numeroOrigen; // Origen del movimiento.
    private int numeroDestino; // Destino. Destino puede ser igual a origen.
    private String fecha;
    private String tipo;
    
    public Movimiento(){
        
    }
    public Movimiento(float unMonto,float saldoRestante,String fecha,
                        String tipo, int src, int dst){
        this.monto = unMonto;
        this.saldoRestante = saldoRestante;
        this.fecha = fecha;
        this.tipo = tipo;
        this.numeroDestino = dst;
        this.numeroOrigen = src;
    }

    public float getMonto() {
        return monto;
    }

    public float getSaldoRestante() {
        return saldoRestante;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroOrigen() {
        return numeroOrigen;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }
    
    
            
}

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
public class Cuenta {
    private int numero;
    private float saldo;
    private final int MAXMOV = 1024;
    private int dimF;
    private Movimiento[] movimiento;
    
    

    public Cuenta(int numero){
        
        this.saldo = 0;
        this.dimF = 0;
        this.numero = numero;
        this.movimiento = new Movimiento[this.MAXMOV];
        this.initArrayMovimiento();
    }
    public Cuenta(){
        this.saldo = 0;
        this.dimF = 0;
        this.movimiento = new Movimiento[this.MAXMOV];
        this.initArrayMovimiento();
    }
    
    
    private void initArrayMovimiento(){
          for (int i = 0; i < this.MAXMOV; i++){
            this.movimiento[i] = new Movimiento();
        }
    }
    
    public void depositarDinero(float valor){
        this.saldo += valor;
    }
    
    
    private String saldoInsuficiente(){
        return "ERROR: Saldo insuficiente. Transaccion Cancelada.";
    }
    
    public void extraerDinero(float valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println(this.saldoInsuficiente());
        }
    }
    
    
    /*Pensar estaá funcion, es decir, si transferis resta de la cuenta
    pero la pregunta es quien debe reciabir es destinatario.*/
    public float transferirDinero(float monto){
        float resul = 0;
        if (this.saldo >= monto) {
            this.saldo -= monto;
            resul =  monto;
        } else System.out.println(this.saldoInsuficiente());
        
        return resul;
    }
    
    public String informarSaldo(){
        return "Saldo disponible: $" + this.saldo; 
    }
    
    
}

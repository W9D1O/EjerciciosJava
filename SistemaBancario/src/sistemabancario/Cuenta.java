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
    
    private boolean hayLugar() {
        return this.dimF < this.MAXMOV;
    }
    
    private void agregarMovimiento(Movimiento unMovimiento) {
        if (this.hayLugar()) {
            this.movimiento[this.dimF] = unMovimiento;
            this.dimF++;
        }
        
    }
    
    private String operacionNoRealizada() {
        return "Error: No se pudo realizar la operacion." +
                " Intentelo mas tarde.";
    }
    
    private float aPositivo(float valor) {
        if (valor < 0) valor *= -1;
        return valor;
    }
    
    
    // No creo que pedir la fecha este bien pero por el momento sirve
    public void depositarDinero(float valor, String fecha){
        valor = aPositivo(valor);
        boolean vf = hayLugar();
        if (vf) {
            this.saldo += valor;
            Movimiento nuevo = new Movimiento(valor,this.saldo,fecha,"Deposito",
                    this.numero,this.numero);
            this.agregarMovimiento(nuevo);
        } else {
            System.out.println(operacionNoRealizada());
            } 
        }
        
    
    
    private String saldoInsuficiente(){
        return "ERROR: Saldo insuficiente. Transaccion Cancelada.";
    }
    

    public void extraerDinero(float valor, String fecha){
        valor = aPositivo(valor);
        if (this.saldo >= valor && valor > 0 && hayLugar()) {
            this.saldo -= valor;
            Movimiento nuevo = new Movimiento(valor,this.saldo,fecha,"Extraccion",
            this.numero,this.numero);
            this.agregarMovimiento(nuevo);
        } else {
            System.out.println(this.saldoInsuficiente());
        }
    }
    
    
    /*Pensar estaá funcion, es decir, si transferis resta de la cuenta
    pero la pregunta es quien debe reciabir es destinatario.*/
    public float transferirDinero(float monto, String fecha, int numeroDestino){
        float resul = 0;
        monto = aPositivo(monto);
        if (this.saldo >= monto && hayLugar()) {
            this.saldo -= monto;
            Movimiento nuevo = new Movimiento(monto,this.saldo,fecha,"Transferencia",
            this.numero,numeroDestino);
            this.agregarMovimiento(nuevo);
            resul =  monto;
            
        } else System.out.println(this.saldoInsuficiente());
        
        return resul;
    }
    
    public void recibirTranferencia(float valor, int numeroOrigen, String fecha) {
        valor = aPositivo(valor);
        if (hayLugar()) {
            this.saldo += valor;
            Movimiento nuevo = new Movimiento(valor,this.saldo,fecha,"Transferencia",
            numeroOrigen,this.numero);
            this.agregarMovimiento(nuevo);
        }
    }
    
    public String informarSaldo(){
        return "Saldo disponible: $" + this.saldo; 
    }

    public int getNumero() {
        return numero;
    }
    
    //TODO: cambiar dimF por dimL
    public String historialMovimientos(){
        String historial = "";
        for (int i = 0; i < this.dimF; i++) {
            historial += this.movimiento[i].toString();
        }
        return historial;
    }
    
    @Override
    public String toString() {
        return "Numero de cuenta: " + this.numero +
                "\nSaldo disponible: " + this.saldo +
                        "\nMovimientos: " + historialMovimientos();
    }
}

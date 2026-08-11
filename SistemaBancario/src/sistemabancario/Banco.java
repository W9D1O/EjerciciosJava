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
public class Banco {
    private String nombre;
    private ArrayCliente clientes;
    private ArrayCuenta cuentas;
    private final int MAXCLIENTE = 1024;
    private final int FACTOR = 2;
    private final int MAXCUENTA = MAXCLIENTE * FACTOR;
    
    public Banco(String unNombre) {
        this.nombre = unNombre;
        this.clientes = new ArrayCliente(this.MAXCLIENTE);
        this.cuentas = new ArrayCuenta(this.MAXCUENTA);
    }
    

    
}

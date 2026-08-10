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
public class ArrayCliente {
    private int maxClientes;
    private int dimL;
    private Cliente[] clientes;
    
    public ArrayCliente(int max){
        this.maxClientes = max;
        this.clientes = new Cliente[this.maxClientes];
        this.dimL = 0;
        this.initArray();
        
    }
    
    /*Podria haber generado una clase abstracta,
    pero por el momento vamos a intentar dominar las bases*/
    private void initArray(){
        for (int i = 0; i < this.maxClientes; i++){
            this.clientes[i] = new Cliente();
        }
    }
    
    
    
}

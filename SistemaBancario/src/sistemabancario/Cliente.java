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
public class Cliente {
    /* ¿Un claiente puede tener usa sola cuenta?*/
    
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayCuenta cuentas;
    
    public Cliente(String unNombre,String unApellido,
                    int unDni,Cuenta unaCuenta, int maxCuentas){
        this.nombre = unNombre;
        this.dni = unDni;
        this.apellido = unApellido;
        this.cuentas = new ArrayCuenta(maxCuentas);
        this.cuentas.agregarCuenta(unaCuenta);
        
        
    }
    
    public Cliente(){

    }
    
    public Cliente(int maxCuentas){
        this.cuentas = new ArrayCuenta(maxCuentas);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayCuenta getCuentas() {
        return this.cuentas;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


        
    
}

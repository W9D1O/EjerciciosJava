/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;
import java.util.Scanner;

/**
 *
 * @author w9d1o
 */
public class Banco {
    private String nombre;
    private ArrayCliente clientes;
    private ArrayCuenta cuentas;
    private ArrayNumeroCuenta numeros;
    private final int MAXCLIENTE = 1024;
    private final int FACTOR = 2;
    private final int MAXCUENTA = MAXCLIENTE * FACTOR;
    
    public Banco(String unNombre) {
        this.nombre = unNombre;
        this.clientes = new ArrayCliente(this.MAXCLIENTE);
        this.cuentas = new ArrayCuenta(this.MAXCUENTA);
        this.numeros = new ArrayNumeroCuenta(this.MAXCUENTA);
    }
    
    
    public void registrarCliente() {
        Cliente nuevo = new Cliente(FACTOR);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Nombre del cliente: ");
        nuevo.setNombre(scanner.nextLine());
        System.out.println("Ingrese el Apellido del cliente: ");
        nuevo.setApellido(scanner.nextLine());
        System.out.println("Ingrese numero de DNI: ");
        nuevo.setDni(scanner.nextInt());
        altaCuenta(nuevo);
        this.clientes.agregarCliente(nuevo);
    }
    
    public void altaCuenta(Cliente unCliente){
        Cuenta nueva = new Cuenta(this.numeros.obtenerNumero());
        unCliente.getCuentas().agregarCuenta(nueva);
        this.cuentas.agregarCuenta(nueva);
    }
    

    public Cliente buscarCliente(String apellido, String nombre) {

        Cliente unCliente = this.clientes.getCliente(nombre, nombre);
        return unCliente;
    }
    
    public Cliente buscarCliente(int dni) {
        Cliente unCliente = this.clientes.getCliente(dni);
        return unCliente;
    }
    
    public Cuenta buscarCuenta(int numeroCuenta) {
        int i = this.cuentas.getIndex(numeroCuenta);
        Cuenta unaCuenta = null;
        if (i >= 0) unaCuenta = this.cuentas.getCuenta(i);
        return unaCuenta;
    }
    
    public void realizarTransferencia(int numeroOrigen, int numeroDestino,
                                        float monto, String fecha) {
        int i = this.cuentas.getIndex(numeroOrigen);
        int j = this.cuentas.getIndex(numeroDestino);
        if (i >= 0 && j >= 0) {
        this.cuentas.getCuenta(i)
        .transferirDinero(monto, fecha, numeroDestino);
        this.cuentas.getCuenta(j)
        .recibirTranferencia(monto, numeroOrigen, fecha);
        }
    }
    
    public void realizarDeposito(float monto, String fecha, int numeroCuenta) {
        int i = this.cuentas.getIndex(numeroCuenta);
        if (i >= 0) {
            this.cuentas.getCuenta(i).depositarDinero(monto, fecha);
        }
    }
    
    public void relizarExtraccion(float monto, String fecha, int numeroCuenta) {
        int i = this.cuentas.getIndex(numeroCuenta);
        if (i >= 0) {
            this.cuentas.getCuenta(i).extraerDinero(monto, fecha);
        } 
    }
}

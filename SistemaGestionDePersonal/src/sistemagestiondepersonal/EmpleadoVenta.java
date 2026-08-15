/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;


import java.time.LocalDate;

/**
 *
 * @author w9d1o
 */
public class EmpleadoVenta extends Empleado{
    private ArrayVenta ventas;
    private double porcentajeComision;
    public EmpleadoVenta(String nombre, String apellido, int dni,
            double sueldoBase, LocalDate fechaDeIngreso,
            int maxVentas, double porcentajeComision) {
        super(nombre,apellido,dni,sueldoBase,fechaDeIngreso);
        ventas = new ArrayVenta(maxVentas);
        this.porcentajeComision = porcentajeComision;
    }
    
    public void registrarVenta(Venta nueva) {
        this.ventas.agregarVenta(nueva);
    }
    
    public double calcularComision() {
        double comision = this.ventas.totalArrayVenta() * (this.porcentajeComision / 100);
        return  comision;
    }
    
    @Override
    public void calcularSalario() {
        super.setSalario(super.getBase() + (calcularComision()));
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Comision: " + this.porcentajeComision + "%"
                + "\nVenta total: $" + this.ventas.totalArrayVenta() +
                "\nTotal obtenido por comision: $" + calcularComision();
    }
}

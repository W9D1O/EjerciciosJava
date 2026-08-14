/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author w9d1o
 */
public class Vendedor extends Empleado{
    private ArrayVenta ventas;
    private double porcentajeComision;
    public Vendedor(String nombre, String apellido, int dni,
            BigDecimal sueldoBase, LocalDate fechaDeIngreso,
            int maxVentas, double porcentajeComision) {
        super(nombre,apellido,dni,sueldoBase,fechaDeIngreso);
        ventas = new ArrayVenta(maxVentas);
        this.porcentajeComision = porcentajeComision;
    }
    
    
}

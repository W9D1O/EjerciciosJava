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
public class Administrativo extends Empleado{
    private BigDecimal adicional;
    
    public Administrativo(String nombre, String apellido, int dni,
            BigDecimal sueldoBase, LocalDate fechaIngreso, BigDecimal adicional) {
        super(nombre, apellido, dni, sueldoBase, fechaIngreso);
        this.adicional = adicional.abs();
    }
    
    @Override
    public void calcularSalario() {
        BigDecimal total = super.getBase().add(adicional);
        super.setSalario(total);
    }
}

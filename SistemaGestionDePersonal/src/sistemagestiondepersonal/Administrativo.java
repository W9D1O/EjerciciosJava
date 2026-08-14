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
public class Administrativo extends Empleado{
    private double adicional;
    
    public Administrativo(String nombre, String apellido, int dni,
            double sueldoBase, LocalDate fechaIngreso, double adicional) {
        super(nombre, apellido, dni, sueldoBase, fechaIngreso);
        this.adicional = aPositivo(adicional);
    }
    
    @Override
    public void calcularSalario() {
        double total = super.getBase() + adicional;
        super.setSalario(total);
    }
}

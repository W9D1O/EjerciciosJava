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
public class EmpleadoGerencia extends Empleado{
    double bono;
    
    public EmpleadoGerencia(String nombre, String apellido, int dni,
            double sueldoBase, LocalDate fechaDeIngreso, double bono) {
        super(nombre,apellido,dni,sueldoBase,fechaDeIngreso);
        this.bono = bono;
    }
    
    @Override
    public void calcularSalario() {
        super.setSalario(super.getBase() + this.bono);
    }
    
    
    @Override
    public String toString() {
        return super.toString()  + "\nBono de gerencia: " + this.bono;
    }
}

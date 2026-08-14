/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestiondepersonal;

/**
 *
 * @author w9d1o
 */
public class Empresa {
    private String nombre;
    private ArrayEmpleado cupo;
    
    public Empresa(String nombre, int maxEmpleados) {
        this.nombre = nombre;
        cupo = new ArrayEmpleado(maxEmpleados);
    }
    
    public void altaEmpleado(Empleado nuevo) {
        this.cupo.agreagarEmpleado(nuevo);
    }
    
    public void consultarEmpleado(int dni) {
        Empleado emp = this.cupo.buscarEmpleado(dni);
        System.out.println(emp.toString());
    }
    
    public void eliminarEmpleado(int dni) {
        this.cupo.eliminarElemento(this.cupo.getIndex(dni));
    }
    
    public Empleado buscarEmpleado(int dni) {
        return this.cupo.buscarEmpleado(dni);
    }
    
    public double calcularCostosSalarios() {
        return this.cupo.arrayEmpleadoCostos();
    }
    
    @Override
    public String toString() {
        String str = "Nombre: " + nombre + "\n";
        str += this.cupo.toString();
        return str;
    }
}
